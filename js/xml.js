
// Función para cargar y transformar cualquier tabla XML
function cargarTablaXML(rutaXml, rutaXslt, idContenedor) {
  const contenedor = document.getElementById(idContenedor);

    Promise.all([
      fetch(rutaXml).then(r => r.text()),
      fetch(rutaXslt).then(r => r.text())
    ])
    .then(([xmlText, xslText]) => {
      const parser = new DOMParser();
      const xml = parser.parseFromString(xmlText, "text/xml");
      const xsl = parser.parseFromString(xslText, "text/xml");

      const proc = new XSLTProcessor();
      proc.importStylesheet(xsl);

      const resultado = proc.transformToFragment(xml, document);

      contenedor.innerHTML = ""; // Borra el texto de "Cargando..."
      contenedor.appendChild(resultado);
      
    })
}

// Carga de Profesores
cargarTablaXML("../XML_Profesores/profesor.xml", "../XML_Profesores/profesor.xslt", "contenedor-profesores");
// Carga de Alumnos
cargarTablaXML("../XML_Alumnos/Alumnos.xml", "../XML_Alumnos/alumnos.xslt", "contenedor-alumnos");
// Carga de Cursos
cargarTablaXML("../XML_Cursos/cursos.xml", "../XML_Cursos/cursos.xslt", "contenedor-cursos");