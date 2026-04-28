document.addEventListener('DOMContentLoaded', () => {
    // 1. Selector de Nivel / Precio Dinámico 
    const nivelSelect = document.getElementById('nivel');
    const contenedorPrecio = document.getElementById('contenedorPrecio');
    const textoPrecio = document.getElementById('textoPrecio');

    const precios = {
        'principiante': 'Precio: 100€ al mes',
        'intermedio': 'Precio: 120€ al mes',
        'avanzado': 'Precio: 150€ al mes'
    };

    if (nivelSelect && textoPrecio) {
        nivelSelect.addEventListener('change', () => {
            const seleccion = nivelSelect.value;
            if (precios[seleccion]) {
                textoPrecio.textContent = precios[seleccion];
                contenedorPrecio.classList.remove('d-none');
            } else {
                contenedorPrecio.classList.add('d-none');
            }
        });
    }

    // 2. Validación del Formulario 
    const form = document.getElementById('registroForm');
    if (form) {
        form.addEventListener('submit', (event) => {
            if (!form.checkValidity()) {
                event.preventDefault();
                event.stopPropagation();
            } else {
                alert('¡Inscripción enviada con éxito!');
            }
            form.classList.add('was-validated');
        }, false);
    }
});