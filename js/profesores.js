// El * trae todo de alumno, y DNIPer.* trae todo de la tabla persona relacionada
const URL_BASE = "http://localhost:8055/items/profesor";
const RELACIONES = "?fields=*,DNIProf.*";
const TOKEN = "RrCEt3NVwqJeJNA1z58S065bCtSipXdB"; 

const headers = {
    "Content-Type": "application/json",
    "Authorization": `Bearer ${TOKEN}`
};

// Referencias del DOM
const tabla = document.getElementById('tabla-cuerpo');
const mensaje = document.getElementById('estado-mensaje');
const formulario = document.getElementById('form-profesor');

// --- FUNCIÓN: LEER (Read) ---
async function cargarProfesores() {
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
                <td>${item.DNIProf.Nombre}</td>
                <td>${item.DNIProf.Apellidos}</td>
                <td>${item.DNIProf.CorreoElec}</td>
                <td class="text-end">
                    <button class="btn btn-sm btn-outline-primary me-1" onclick='prepararEdicion(${JSON.stringify(item)})'>
                        Editar
                    </button>
                    <button class="btn btn-sm btn-outline-danger" onclick="borrarProfesor('${item.DNIProf.DNI}')">
                        Borrar
                    </button>
                </td>
            </tr>`;
    });
}

    // --- CREAR / ACTUALIZAR ---
formulario.addEventListener('submit', async (e) => {
    e.preventDefault();
    
    const idExistente = document.getElementById('input-id-hidden').value;
    
    const datos = {
        "Horario": document.getElementById('input-horario').value,
        "NivDificultad": document.getElementById('select-nivel').value,
        "ProgEstudios": document.getElementById('input-programa').value,
        "Idioma": document.getElementById('select-idioma').value,
        "DNIProfe": document.getElementById('input-dni-profe').value
    };

    const metodo = idExistente ? 'PATCH' : 'POST';
    const urlFinal = idExistente ? `${URL_BASE}/${idExistente}` : URL_BASE;

    try {
        const res = await fetch(urlFinal, {
            method: metodo,
            headers: headers,
            body: JSON.stringify(datos)
        });

        if (res.ok) {
            alert("Curso guardado correctamente");
            limpiarFormulario();
            cargarCursos();
        }
    } catch (err) {
        alert("Error al guardar el curso");
    }
});

// --- BORRAR ---
async function borrarCurso(id) {
    if (!confirm("¿Eliminar este curso?")) return;
    try {
        const res = await fetch(`${URL_BASE}/${id}`, { method: 'DELETE', headers });
        if (res.ok) cargarCursos();
    } catch (err) {
        console.error("Error al borrar");
    }
}

// --- UTILIDADES ---
function prepararEdicion(item) {
   document.getElementById('input-dni-hidden').value = item.DNIProf.DNI; 
    document.getElementById('input-dni-real').value = item.DNIProf.DNI;
    document.getElementById('input-dni-real').readOnly = true;
    
    document.getElementById('input-nombre').value = item.DNIProf.Nombre;
    document.getElementById('input-apellido').value = item.DNIProf.Apellidos;
    document.getElementById('input-email').value = item.DNIProf.CorreoElec;
    document.getElementById('input-tel').value = item.DNIProf.NumTel;
    document.getElementById('input-fecha').value = item.DNIProf.FecNacimiento;
    document.getElementById('input-domicilio').value = item.DNIProf.Domicilio;
    document.getElementById('input-cp').value = item.DNIProf.CódPost;
    
document.getElementById('input-fechContratacion').value = item.FechContratación.slice(0, 16);    
    document.getElementById('form-titulo').innerText = "Editando Profesor: " + item.DNIProf.DNI;
}

function limpiarFormulario() {
    formulario.reset();
    document.getElementById('input-dni-hidden').value = "";
    document.getElementById('input-dni-real').readOnly = false;
    document.getElementById('form-titulo').innerText = "Registrar Nuevo Profesor";
}

// Ejecutar al cargar la página
window.onload = cargarProfesores;