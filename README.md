# Examen-Credencial

Profesora, para que corra este programa es necesario que cambie algunas rutas, las imagenes necesarias ya estaran en la carpeta que dice INE, es una carpeta aparte donde vienen imagenes, solo necesitara poner la ubicacion de cuando las descargue en:

-Metodo private void BotonCrear 
   Cambiar la ubicacion de:
   String imagen
   String imagen2
   String imagen3
   
   y en documento.save() poner una ubicacion para guardar el archivo pdf.
   
-Metodo private void AbrirPDF
  File path = new File("") poner la misma ubicacion que documento.save para que abra el pdf.
  
  
-Metodo public void JFileChoose
  en  rsdragdropfiles.RSDragDropFiles.setCopiar(ft.getSelectedFile().toString(), "C:\\Users\\migue\\Desktop\\INE\\fondo.png")
                                                                                              cambiar esta ruta.
                                                                                              
          REPITO 
          TODAS LAS IMAGENES LAS VOY A ADJUNTAR EN UNA CARPETA SEPARADA, SOLO ES COSA DE CAMBIAR LA UBICACION, porfavor <3
          
          
          
         
         PD: Al momento de elegir la imagen para la foto en el boton IMAGEN, esta solo soporta formatos .png por lo que usar otros dara un error.
         
         GRACIAS <3
