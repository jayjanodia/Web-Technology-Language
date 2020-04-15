<?xml version="1.0"?>

<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
	<html>
		<head>
			<link rel = "stylesheet" type="text/css" href="mystyle.css" />
		</head>
		<body>
			<h1>Site Map</h1>
			<hr />
			<table id = "sitemap">
				<tr>
					<th>Websites</th>
					<th>Essentials</th>
					<th>About</th>
				</tr>
				<!--xml link from here-->
				<xsl:for-each select="sitemap/row1">
					<tr>
						<td><a class="fromLeft" href="pizza_delivery.html"><xsl:value-of select="home"/></a></td>
						<td><xsl:value-of select="prof"/></td>
						<td><xsl:value-of select="help"/></td>
					</tr>
				</xsl:for-each>
				<xsl:for-each select="sitemap/row2">
					<tr>
						<td><xsl:value-of select="menu"/></td>
						<td><xsl:value-of select="pref"/></td>
						<td><xsl:value-of select="ab"/></td>
					</tr>
				</xsl:for-each>
				<xsl:for-each select="sitemap/row3">
					<tr>
						<td><xsl:value-of select="loc"/></td>
						<td><xsl:value-of select="cart"/></td>
						<td><xsl:value-of select="cont"/></td>
					</tr>
				</xsl:for-each>
				<xsl:for-each select="sitemap/row4">
					<tr>
						<td><xsl:value-of select="login"/></td>
						<td><xsl:value-of select="hist"/></td>
						<td><xsl:value-of select="tc"/></td>
					</tr>
				</xsl:for-each>
				<xsl:for-each select="sitemap/row5">
					<tr>
						<td><xsl:value-of select="sinup"/></td>
					</tr>
				</xsl:for-each>
			</table>
		</body>
	</html>
</xsl:template>
</xsl:stylesheet>
