const URL_BASE = "http://localhost:8055/items/curso";
const TOKEN = "RrCEt3NVwqJeJNA1z58S065bCtSipXdB"; 

const headers = {
    "Content-Type": "application/json",
    "Authorization": `Bearer ${TOKEN}`
};

const tabla = document.getElementById('tabla-cuerpo');
const mensaje = document.getElementById('estado-mensaje');
const formulario = document.getElementById('form-curso');

// --- LEER ---
async function cargarCursos() {
    mensaje.innerHTML = '<span class="text-primary">Cargando datos...</span>';
    try {
        const respuesta = await fetch(URL_BASE, { method: 'GET', headers });
        const json = await respuesta.json();
        mostrarTabla(json.data);
        mensaje.innerHTML = ''; 
    } catch (error) {
        mensaje.innerHTML = `<span class="text-danger">Error: ${error.message}</span>`;
    }
}

function mostrarTabla(datos) {
    tabla.innerHTML = '';
    datos.forEach(curso => {
        tabla.innerHTML += `
            <tr>
                <td>${curso.Horario}</td>
                <td>${curso.NivDificultad}</td>
                <td>${curso.Idioma}</td>
                <td class="text-end">
                    <button class="btn btn-sm btn-outline-primary" onclick='prepararEdicion(${JSON.stringify(curso)})'>Editar</button>
                    <button class="btn btn-sm btn-outline-danger" onclick="borrarCurso(${curso.Id})">Eliminar</button>
                </td>
            </tr>`;
    });
}

// --- CREAR / ACTUALIZAR ---
formulario.addEventListener('submit', async (e) => {
    e.preventDefault();
    
    const idExistente = document.getElementById('input-id-hidden').value;
    const datosCurso = {
        "Horario": document.getElementById('input-horario').value,
        "NivDificultad": document.getElementById('select-nivel').value,
        "ProgEstudios": document.getElementById('input-programa').value,
        "Idioma": document.getElementById('select-idioma').value,
        "DNIProfe": document.getElementById('input-dni-profe').value
    };

    const metodo = idExistente ? 'PATCH' : 'POST';
    const urlFinal = idExistente ? `${URL_BASE}/${idExistente}` : URL_BASE;

    try {
        const respuesta = await fetch(urlFinal, {
            method: metodo,
            headers: headers,
            body: JSON.stringify(datosCurso)
        });

        if (respuesta.ok) {
            cargarCursos();
            formulario.reset();
            document.getElementById('input-id-hidden').value = "";
            mensaje.innerHTML = '<span class="text-success">¡Guardado con éxito!</span>';
        }
    } catch (error) {
        mensaje.innerHTML = '<span class="text-danger">Error al guardar.</span>';
    }
});

// --- BORRAR ---
async function borrarCurso(id) {
    if (!confirm("¿Eliminar?")) return;
    const res = await fetch(`${URL_BASE}/${id}`, { method: 'DELETE', headers });
    if (res.ok) cargarCursos();
}

// --- UTILIDADES ---
function prepararEdicion(item) {
    document.getElementById('input-id-hidden').value = item.Id;
    document.getElementById('input-horario').value = item.Horario;
    document.getElementById('select-nivel').value = item.NivDificultad;
    document.getElementById('select-idioma').value = item.Idioma;
    document.getElementById('input-programa').value = item.ProgEstudios;
    document.getElementById('input-dni-profe').value = item.DNIProfe;
    document.getElementById('form-titulo').innerText = "Editando Curso ID: " + item.Id;
}

window.onload = cargarCursos;