<?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet href="profesor.xslt" type="text/xsl"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/">
    
    <table class="table table-striped table-hover shadow-sm mt-3">
      <thead class="table-dark bg-custom2 border: none;">
          <tr>
            <th>DNI</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Correo</th>            
          </tr>
          </thead>
      <tbody class="table-group-divider">
          <xsl:for-each select="profesores/profesor">
            <tr>
              <td><xsl:value-of select="@dni"/></td>
              <td><xsl:value-of select="nombre"/></td>
              <td><xsl:value-of select="apellidos"/></td>
              <td><xsl:value-of select="correoElec"/></td>
            </tr>
          </xsl:for-each>
      </tbody>
        </table>
      
  </xsl:template>
</xsl:stylesheet>