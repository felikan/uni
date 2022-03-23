<h1>Webtechnologien</h1>

Html:
-	Struktur und Inhalt
-	Überschriften, Absätze
-	Wie: Texte schreiben in Word

CSS:
-	Cascading Style Sheet
-	Sorgt fürs gute Aussehen
-	Style, Animation

JavaScript:
-	Funktionabel
-	Rechnen

Html
-	Kommentare: <!--Kommentar-->
-	<!DOCTYPE HTML> um Dokumententyp hinzuweisen
-	Tags haben ein öffnendes und schließendes Element
-	Alles zwischen < und > ist ein Tag (html, title…)

Tags
-	Müssen ineinander verschachtelt werden
-	Beliebig tief verschachtelt werden
-	Nicht jedes Tag an beliebiger stelle
-	Falsch verschachtelte Tags verursachen keine Fehlermeldung
-	Bsp: <head> innerhalb von <body> nicht valide

-	HTML unterstützt bis zu 6 Ebenen von Überschriften 
	``` <h2>Überschrift2</h2> ```
-	```<p> ```für Paragraph
-	Lorem Ipsum als sinnloser Fülltext (lipsum.com)

Links
-	Mit ```<a> ```gesetzt
-	Neu: mit Attribute
-	Attribute werden in öffnendes Tag geschrieben
-	Attribute haben Namen und wert
-	Eine ID darf nur einmal vergeben werden
-	Links Schreibweise:
-	Attribute : href=
-	Auf Seite mit # Ziel angeben (Bsp: #oben)
-	Auf externe Seiten nur URL einfügen
-	Neues Fenster durch link klicken durch Attribut Target=“_blank“
-	```<a href=“#oben id=“meinlink“>Link</a> ```

Bilder:
-	```<img>``` tag
-	Quelle über src (Attribut)
-	Alt=“alternativer Bildtext“ 
-	Void Element also / kann weggelassen werden bzw. hat kein Schließtag
-	Width und hight lässt größe des Bildes bestimmen

Metadaten 
-	im Head Tag
-	Infos über Dokument
-	von Suchmaschinen ausgewertet
-	Character Encoding (Text Codierung) meist UTF  8

Webserver und DNS:
-	Websites sind auf Webservern abgelegt und an die Welt geliefert
-	Webhoster stellen Webspace und mögl auch Webadresse
-	DNS um IP zu erfahren und URL aufzulösen und auf Webserver zuzugreifen 

-	http Request:
-	siehe Präsi

-	span Tag:
-	keine sematische Bedeutung
-	style Attribute

CSS
-	Bsp.: ```<span style=“color: red; background-color:gray;“>Text zum stylen</span>```
-	Enthält die Formatvorgaben für das HTML Element
-	Inline Styling lieber nicht verwenden, da unübersichtlich zum Schluss
-	Stylesheets:
-	Können im head Bereich als separate Datei eingebunden werden
-	Enden auf .css
-	Im head mit style Tag
-	Um CSS datei einzubinden <link>
-	In Css Datei:
-	Span {attribute}
-	Auch mit #id {} möglich (nur einmal)
-	Oder klassen: .klasse{} (beliebig oft verwendbar)
-	Mit Inline überschreibt man Daten aus CSS Dateien

Font-Size:
-	Px Pixel oder pt Points
-	Small, medium, large….
-	Mit Prozent: macht Schrift gegenüber umgebende Größe größer

Liste
-	```<ul> ```oder ```<ol> ```und schließendes Element
-	Neues Listenelemet: ```<li>```
```
	<ul>
		<li>hier können sie eine Tabelle erweitern mit JavaScript</li>
	</ul>
```

Tabelle:
-	```<table>``` und schließendes Element
-	```<tbody>``` umschließt Tabellen Inhalt
-	```<tr> ```Zeilen
-	KEINE SPALTEN
-	```<td>``` für Inhalt
-	IMMER AN SCHLUSSTAGS DENKEN
```
<table>
  <tr>
    <td>Inhalt</td>
  </tr>
</table>
```

Formulare:
-	Daten vom Client zum Server
-	Z.b.:
-	Login
-	Kontaktformular
-	Wiki Seiten
-	```<form>``` Tag
-	Action gibt an wohin Daten gesendet werden
-	Method, wie Daten versenden
-	Accept-charset für Encoding
-	```<input>``` Tags
-	Input type=“…“ name=“….“
-	Mit zusätzlichem Attribut „required“ muss eingaben festleegn 
-	Passwort:
-	Type: „password“
-	Request method Typen
-	Get (über url übertragene Daten)
-	Post (über Datei übertragene Daten)
-	Bei Übertragen von Daten in Datenbanken, Codes…. Immer serverseitig  Prüfungen anstellen, um Richtigkeit der eingaben zu prüfen!!!

DIV
-	Blockbildung
-	Bei css
-	Width
-	Height
-	Padding
-	Margin

Iframe Tag
-	Andere HTML Seite in aktuelle einbinden
-	Src Atrribut
-	Mit css zu stylen

Javascript
-	Programmieren in html
-	Sript tag um u beginnen/enden
-	This. //auf Instanzvariable zugreifen
-	Prüfungsrelevant:
-	``` var li =document.createElement("li");```
-	```li.appendChild(document.createTextNode(text));```
-	```this.ausgabeFeld.appendChild(li); ```

Ajax:
-	Asynchrones JavaScript and XML
-	Asynchron: Website bleibt nutzbar, wärend im Hintergrund Daten geladen werden (Bsp.: Suche bei Google und dort die Suchvorschläge, die ständig aktualisiert werden)
XML
-	Als Austauschdateien mit Daten als Inhalt
-	 
JavaScript:
-	Im head JS:
-	Variable aus eingabefeld:
-	```var variable1 = document.getElementbyId(„idname“).value;```
	
```
<head>
    <script>
            function(){
                var variable1 = document.getElementById("idname").value;
                alert(variable1);	 //Ausgabe idname

                //Textknoten hinzufügen
                var neuvar1 =document.createTextNode(varibale1);

                Var r = document.createElement(„td“);
                Name.appendChild(neuvar1); //<td>idname</td>

                //td zu tr hinzufügen
                Tablerow.appendchild(name);

                //Referenz zu gesammten tabelle
                Gesamte_tabelle.append.child(tablerow);
            }
    </script>
</head>
<body>
    <form>
	    <Input type=“text“ id=“idname“ name=“baleipzig“ />
    </form>
</body>
```
