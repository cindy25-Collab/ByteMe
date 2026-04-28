<?xml version="1.0" encoding="UTF-8"?>
<?xml-stylesheet href="cursos.xslt" type="text/xsl"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/">
    
    <table class="table table-striped table-hover shadow-sm mt-3">
      <thead class="table-dark bg-custom2 border: none;">
          <tr>
            <th>Idioma</th>
            <th>Horario</th>
            <th>Dificultad</th>
          </tr>
          </thead>
      <tbody class="table-group-divider">
          <xsl:for-each select="cursos/curso">
            <tr>
              <td><xsl:value-of select="idioma"/></td>
              <td><xsl:value-of select="Horario"/></td>
              <td><xsl:value-of select="NivelDificultad"/></td>
            </tr>
          </xsl:for-each>
      </tbody>
        </table>
  </xsl:template>
</xsl:stylesheet>