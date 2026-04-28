<?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet href="alumnos.xslt" type="text/xsl"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/">
        <table class="table table-striped table-hover shadow-sm mt-3">
          <thead class="table-dark bg-custom2 border: none;">
          <tr>
            <th>Nombre</th>
            <th>Apellidos</th>
            <th>Correo Electrónico</th>
          </tr>
          </thead>
      <tbody class="table-group-divider">
          <xsl:for-each select="alumnos/alumno">
            <tr>
              <td><xsl:value-of select="nombre"/></td>
              <td><xsl:value-of select="apellidos"/></td>
              <td><xsl:value-of select="correoElectronico"/></td>
            </tr>
          </xsl:for-each>
      </tbody>
        </table>
  </xsl:template>
</xsl:stylesheet>