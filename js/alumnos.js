// El * trae todo de alumno, y DNIPer.* trae todo de la tabla persona relacionada
const URL_BASE = "http://localhost:8055/items/alumno";
const RELACIONES = "?fields=*,DNIPer.*";
const TOKEN = "RrCEt3NVwqJeJNA1z58S065bCtSipXdB"; 

const headers = {
    "Content-Type": "application/json",
    "Authorization": `Bearer ${TOKEN}`
};

// Referencias del DOM
const tabla = document.getElementById('tabla-cuerpo');
const mensaje = document.getElementById('estado-mensaje');
const formulario = document.getElementById('form-alumno');

// --- FUNCIÓN: LEER (Read) ---
async function cargarAlumnos() {
    mensaje.innerHTML = '<span class="text-primary">Cargando datos...</span>'; // Estado de carga
    
    try {
        const respuesta = await fetch(URL_BASE + RELACIONES, { method: 'GET', headers });
        
        if (!respuesta.ok) throw new Error("Error HTTP: " + respuesta.status); // res.ok
        
       const json = await respuesta.json();
        mostrarTabla(json.data);
        mensaje.innerHTML = ''; 
    } catch (error) {
        mensaje.innerHTML = `<span class="text-danger">Fallo de red: ${error.message}</span>`;
    }
}

function mostrarTabla(datos) {
    tabla.innerHTML = "";
    datos.forEach(item => {
        tabla.innerHTML += `
            <tr>
                <td>${item.DNIPer.Nombre}</td>
                <td>${item.DNIPer.Apellidos}</td>
                <td>${item.DNIPer.CorreoElec}</td>
                <td class="text-end">
                    <button class="btn btn-sm btn-outline-primary me-1" onclick='prepararEdicion(${JSON.stringify(item)})'>
                        Editar
                    </button>
                    <button class="btn btn-sm btn-outline-danger" onclick="borrarAlumno('${item.DNIPer.DNI}')">
                        Borrar
                    </button>
                </td>
            </tr>`;
    });
}

// --- FUNCIÓN: CREAR Y ACTUALIZAR (Create & Update) ---
formulario.addEventListener('submit', async (e) => {
    e.preventDefault();
    
    const dniExistente = document.getElementById('input-dni-hidden').value;
    const datos = {
        "IdiomaNativo": document.getElementById('input-idioma').value,
        "DNIProfesor": document.getElementById('input-dni-profe').value,
        "DNIPer": {
            "DNI": document.getElementById('input-dni-real').value,
            "Nombre": document.getElementById('input-nombre').value,
            "Apellidos": document.getElementById('input-apellido').value,
            "CorreoElec": document.getElementById('input-email').value,
            "NumTel": parseInt(document.getElementById('input-tel').value),
            "FecNacimiento": document.getElementById('input-fecha').value,
            "Domicilio": document.getElementById('input-domicilio').value,
            "CódPost": parseInt(document.getElementById('input-cp').value)
        }
    };

    // Si tiene ID usamos PATCH (editar), si no POST (crear)
    const metodo = dniExistente ? 'PATCH' : 'POST';
    const urlFinal = dniExistente ? `${URL_BASE}/${dniExistente}` : URL_BASE;

    try {
        const res = await fetch(urlFinal, {
            method: metodo,
            headers: headers,
            body: JSON.stringify(datos)
        });

        if (res.ok) {
            alert("¡Guardado con éxito!");
            limpiarFormulario();
            cargarAlumnos();
        }else {
            const errorData = await res.json();
            alert("Error de la API: " + errorData.errors[0].message);
        }
    } catch (err) {
        alert("No se pudo guardar la información.");
    }
});

// --- FUNCIÓN: BORRAR (Delete) ---
async function borrarAlumno(dni) {
    if (!confirm("¿Seguro que quieres borrar este alumno?")) return; // Confirmación requerida

    try {
        const res = await fetch(`${URL_BASE}/${dni}`, { method: 'DELETE', headers });
        if (res.ok) cargarAlumnos();
    } catch (err) {
        console.error("Error al borrar");
    }
}

// --- UTILIDADES ---
function prepararEdicion(item) {
   document.getElementById('input-dni-hidden').value = item.DNIPer.DNI; 
    document.getElementById('input-dni-real').value = item.DNIPer.DNI;
    document.getElementById('input-dni-real').readOnly = true;
    
    document.getElementById('input-nombre').value = item.DNIPer.Nombre;
    document.getElementById('input-apellido').value = item.DNIPer.Apellidos;
    document.getElementById('input-email').value = item.DNIPer.CorreoElec;
    document.getElementById('input-tel').value = item.DNIPer.NumTel;
    document.getElementById('input-fecha').value = item.DNIPer.FecNacimiento;
    document.getElementById('input-domicilio').value = item.DNIPer.Domicilio;
    document.getElementById('input-cp').value = item.DNIPer.CódPost;
    
    document.getElementById('input-idioma').value = item.IdiomaNativo;
    document.getElementById('input-dni-profe').value = item.DNIProfesor;
    
    document.getElementById('form-titulo').innerText = "Editando Alumno: " + item.DNIPer.DNI;
}

function limpiarFormulario() {
    formulario.reset();
    document.getElementById('input-dni-hidden').value = "";
    document.getElementById('input-dni-real').readOnly = false;
    document.getElementById('form-titulo').innerText = "Registrar Nuevo Alumno";
}

// Ejecutar al cargar la página
window.onload = cargarAlumnos;