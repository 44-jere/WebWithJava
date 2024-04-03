function toggleBanner() {
    let banner = document.getElementById("banner");
    banner.classList.toggle("oculto");
    let boton = document.querySelector(".boton");
    boton.textContent = banner.classList.contains("oculto") ? "Abrir banner" : "Cerrar banner";
}

function llamarServlet() {
    fetch('openfile')
        .then(response => {
            if (!response.ok) {
                throw new Error('Error en la respuesta del servidor: ' + response.status);
            }
            return response.text();
        })
        .then(data => {
            document.getElementById('resultado').textContent = data;
        })
        .catch(error => {
            console.error('Error al llamar al Servlet:', error);
            // Aquí podrías manejar el error mostrando un mensaje al usuario, por ejemplo:
            // document.getElementById('resultado').textContent = 'Error al llamar al Servlet: ' + error.message;
        });
}
