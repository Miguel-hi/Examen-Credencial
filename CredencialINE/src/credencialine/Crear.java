
package credencialine;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

/**
 *
 * @author Miguel Olivares Rodriguez
 */
public class Crear extends JFrame {

    private JPanel panel;
    private JTextField nombre;
    private JTextField apellidopaterno;
    private JTextField apellidomaterno;
    private JTextField colonia;
    private JTextField calle;
    private JTextField municipio;
    private JTextField curp;
    private JTextField fecha;
    private JTextField sexo;
    private JButton boton;

    private JTextField elector;
    private JTextField estado;
    private JTextField localidad;
    private JTextField munici;
    private JTextField emision;
    private JTextField seccion;
    private JTextField vigencia;
    private JTextField registro;

    public Crear() {

        this.setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("<<<<PDF>>>>");
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension(200, 200));

        Iniciar();

    }

    private void Iniciar() {

        Panel();
        Etiquetas();
        Texto();
        BotonCrear();
        BotonAbrir();

        BotonImagen();
        //  BotonSalir();
    }

    private void Panel() {

        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void Etiquetas() {

        JLabel etiqueta0 = new JLabel("Ingresa todos lo datos que se te piden:");//texto etiqueta
        panel.add(etiqueta0);//agregamos un panel a la etiqueta
        etiqueta0.setBounds(50, 20, 400, 80);//dimension de la etiqueta x,y,ancho,alto
        etiqueta0.setForeground(Color.black);//color del texto
        etiqueta0.setFont(new Font("Calibri Light", Font.ITALIC, 22));//tipo de fuente y tamaño de la letra

        // Etiqueta para el Apellido Paterno //
        JLabel etiqueta = new JLabel("Apellido Parterno: ");
        panel.add(etiqueta);
        etiqueta.setBounds(50, 80, 200, 80);
        etiqueta.setForeground(Color.black);
        etiqueta.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para el Apellido Materno //
        JLabel etiqueta1 = new JLabel("Apellido Materno: ");
        panel.add(etiqueta1);
        etiqueta1.setBounds(50, 120, 200, 80);
        etiqueta1.setForeground(Color.black);
        etiqueta1.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para el Nombre(s) //
        JLabel etiqueta2 = new JLabel("Nombre(s): ");
        panel.add(etiqueta2);
        etiqueta2.setBounds(50, 160, 200, 80);
        etiqueta2.setForeground(Color.black);
        etiqueta2.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para la Calle y el Numero //
        JLabel etiqueta3 = new JLabel("Calle y No.: ");
        panel.add(etiqueta3);
        etiqueta3.setBounds(50, 200, 200, 80);
        etiqueta3.setForeground(Color.black);
        etiqueta3.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para la Colonia y el Codigo Postal //
        JLabel etiqueta4 = new JLabel("Colonia y C.P.: ");
        panel.add(etiqueta4);
        etiqueta4.setBounds(50, 240, 220, 80);
        etiqueta4.setForeground(Color.black);
        etiqueta4.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para el Municipio //
        JLabel etiqueta5 = new JLabel("Municipio: ");
        panel.add(etiqueta5);
        etiqueta5.setBounds(50, 280, 200, 80);
        etiqueta5.setForeground(Color.black);
        etiqueta5.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para la CURP //
        JLabel etiqueta6 = new JLabel("CURP: ");
        panel.add(etiqueta6);
        etiqueta6.setBounds(50, 320, 200, 80);
        etiqueta6.setForeground(Color.black);
        etiqueta6.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para la Fecha de Nacimiento //
        JLabel etiqueta7 = new JLabel("Fecha de Nacimiento: ");
        panel.add(etiqueta7);
        etiqueta7.setBounds(50, 360, 200, 80);
        etiqueta7.setForeground(Color.black);
        etiqueta7.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para el Sexo //
        JLabel etiqueta8 = new JLabel("Sexo: ");
        panel.add(etiqueta8);
        etiqueta8.setBounds(50, 400, 200, 80);
        etiqueta8.setForeground(Color.black);//color del texto
        etiqueta8.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        // Etiqueta para la clave de elector //
        JLabel etiqueta9 = new JLabel("Clave Elector: ");
        panel.add(etiqueta9);
        etiqueta9.setBounds(500, 80, 200, 80);
        etiqueta9.setForeground(Color.black);//color del texto
        etiqueta9.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        JLabel etiqueta10 = new JLabel("Estado: ");
        panel.add(etiqueta10);
        etiqueta10.setBounds(500, 120, 200, 80);
        etiqueta10.setForeground(Color.black);//color del texto
        etiqueta10.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        JLabel etiqueta11 = new JLabel("Localidad: ");
        panel.add(etiqueta11);
        etiqueta11.setBounds(500, 160, 200, 80);
        etiqueta11.setForeground(Color.black);//color del texto
        etiqueta11.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        JLabel etiqueta12 = new JLabel("Municipio: ");
        panel.add(etiqueta12);
        etiqueta12.setBounds(500, 200, 200, 80);
        etiqueta12.setForeground(Color.black);//color del texto
        etiqueta12.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        JLabel etiqueta13 = new JLabel("Emision: ");
        panel.add(etiqueta13);
        etiqueta13.setBounds(500, 240, 200, 80);
        etiqueta13.setForeground(Color.black);//color del texto
        etiqueta13.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        JLabel etiqueta14 = new JLabel("Año de Registro: ");
        panel.add(etiqueta14);
        etiqueta14.setBounds(500, 280, 200, 80);
        etiqueta14.setForeground(Color.black);//color del texto
        etiqueta14.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        JLabel etiqueta15 = new JLabel("Seccion: ");
        panel.add(etiqueta15);
        etiqueta15.setBounds(500, 320, 200, 80);
        etiqueta15.setForeground(Color.black);//color del texto
        etiqueta15.setFont(new Font("Calibri Light", Font.ITALIC, 22));

        JLabel etiqueta16 = new JLabel("Vigencia: ");
        panel.add(etiqueta16);
        etiqueta16.setBounds(500, 360, 200, 80);
        etiqueta16.setForeground(Color.black);//color del texto
        etiqueta16.setFont(new Font("Calibri Light", Font.ITALIC, 22));
    }

    private void Texto() {

        // Apellido Paterno //
        apellidopaterno = new JTextField();
        apellidopaterno.setBounds(230, 100, 150, 35);
        panel.add(apellidopaterno);

        // Apellido Materno //
        apellidomaterno = new JTextField();
        apellidomaterno.setBounds(230, 140, 150, 35);
        panel.add(apellidomaterno);

        // Nombre //
        nombre = new JTextField();
        nombre.setBounds(230, 180, 150, 35);
        panel.add(nombre);

        // Calle //  
        calle = new JTextField();
        calle.setBounds(230, 220, 150, 35);
        panel.add(calle);

        // Colonia y Codigo Postal //
        colonia = new JTextField();
        colonia.setBounds(230, 260, 150, 35);
        panel.add(colonia);

        // Municipio //
        municipio = new JTextField();
        municipio.setBounds(230, 300, 150, 35);
        panel.add(municipio);

        // CURP //
        curp = new JTextField();
        curp.setBounds(230, 340, 150, 35);
        panel.add(curp);

        // Fecha de Nacimiento //
        fecha = new JTextField();
        fecha.setBounds(250, 380, 130, 35);
        panel.add(fecha);

        // Sexo //
        sexo = new JTextField();
        sexo.setBounds(230, 420, 150, 35);
        panel.add(sexo);

        //  Clave de Elector //
        elector = new JTextField();
        elector.setBounds(650, 100, 150, 35);
        panel.add(elector);

        estado = new JTextField();
        estado.setBounds(650, 140, 150, 35);
        panel.add(estado);

        localidad = new JTextField();
        localidad.setBounds(650, 180, 150, 35);
        panel.add(localidad);

        munici = new JTextField();
        munici.setBounds(650, 220, 150, 35);
        panel.add(munici);

        emision = new JTextField();
        emision.setBounds(650, 260, 150, 35);
        panel.add(emision);

        registro = new JTextField();
        registro.setBounds(680, 300, 120, 35);
        panel.add(registro);

        seccion = new JTextField();
        seccion.setBounds(650, 340, 150, 35);
        panel.add(seccion);

        vigencia = new JTextField();
        vigencia.setBounds(650, 380, 150, 35);
        panel.add(vigencia);

    }

    private void BotonCrear() {
        boton = new JButton("Crear PDF");
        boton.setBounds(220, 485, 120, 40);
        boton.setForeground(java.awt.Color.black);
        boton.setFont(new java.awt.Font("Baskerville", java.awt.Font.CENTER_BASELINE, 15));
        boton.setEnabled(true);

        panel.add(boton);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String imagen = "C:\\Users\\migue\\Desktop\\INE\\ine enfrente.jpg";

                String imagen2 = "C:\\Users\\migue\\Desktop\\INE\\ine detras.jpg";
                
                String imagen3 = "C:\\Users\\migue\\Desktop\\INE\\fondo.png";

                try {
                    PDDocument documento = new PDDocument();
                    PDRectangle mypage = new PDRectangle(1000, 600);
                    PDPage pagina = new PDPage(mypage);
                    documento.addPage(pagina);

                    PDImageXObject image = PDImageXObject.createFromFile(imagen, documento);
                    PDImageXObject image2 = PDImageXObject.createFromFile(imagen2, documento);
                    PDImageXObject image3 = PDImageXObject.createFromFile(imagen3, documento);
                    PDPageContentStream contenido = new PDPageContentStream(documento, pagina);

                    // contenido.drawImage(image, 4.5f, 0.3f);
                    contenido.drawImage(image, 55, 300, 425, 250);
                    contenido.drawImage(image2, 505, 40, 425, 250);
                    contenido.drawImage(image3, 102, 340, 80, 130);
                    contenido.drawImage(image3, 419, 379, 50, 70);
                    contenido.beginText();

                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //   contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(197, pagina.getMediaBox().getHeight() - 132);
                    contenido.showText(apellidopaterno.getText());
                    contenido.endText();

                    /////// Materno...............
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(197, pagina.getMediaBox().getHeight() - 142);
                    contenido.showText(apellidomaterno.getText());
                    contenido.endText();

                    ///////// Nombre..............  
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(197, pagina.getMediaBox().getHeight() - 152);
                    contenido.showText(nombre.getText());
                    contenido.endText();

                    ////////// Calle.............
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(197, pagina.getMediaBox().getHeight() - 184);
                    contenido.showText(calle.getText());
                    contenido.endText();

                    ////////// Colonia y Codigo Postal..........
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(197, pagina.getMediaBox().getHeight() - 194);
                    contenido.showText(colonia.getText());
                    contenido.endText();

                    ///////////// Municipio..........
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(197, pagina.getMediaBox().getHeight() - 204);
                    contenido.showText(municipio.getText());
                    contenido.endText();

                    ////////// CURP.................
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 9);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(224, pagina.getMediaBox().getHeight() - 240);
                    contenido.showText(curp.getText());
                    contenido.endText();

                    //////// Fecha de Nacimiento..............
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(405, pagina.getMediaBox().getHeight() - 130);
                    contenido.showText(fecha.getText());
                    contenido.endText();

                    //////////  Sexo............
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(457, pagina.getMediaBox().getHeight() - 143);
                    contenido.showText(sexo.getText());
                    contenido.endText();

                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(457, pagina.getMediaBox().getHeight() - 143);
                    contenido.showText(elector.getText());
                    contenido.endText();

                    //////////////////////////////////////////////////////////////
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(457, pagina.getMediaBox().getHeight() - 143);
                    contenido.showText(estado.getText());
                    contenido.endText();

                    //////////////////////////////
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(457, pagina.getMediaBox().getHeight() - 143);
                    contenido.showText(localidad.getText());
                    contenido.endText();

                    ////////////
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(457, pagina.getMediaBox().getHeight() - 143);
                    contenido.showText(munici.getText());
                    contenido.endText();

                    //////////////////////////////
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(457, pagina.getMediaBox().getHeight() - 143);
                    contenido.showText(emision.getText());
                    contenido.endText();

                    ////////////////////
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(457, pagina.getMediaBox().getHeight() - 143);
                    contenido.showText(registro.getText());
                    contenido.endText();

                    ///////////////////////////////
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(457, pagina.getMediaBox().getHeight() - 143);
                    contenido.showText(seccion.getText());
                    contenido.endText();

                    ///////////////////////////////
                    contenido.beginText();
                    contenido.setFont(PDType1Font.HELVETICA_OBLIQUE, 10);
                    //  contenido.setLeading(14.5f);
                    contenido.newLineAtOffset(457, pagina.getMediaBox().getHeight() - 143);
                    contenido.showText(vigencia.getText());
                    contenido.endText();

                    contenido.close();

                    documento.save("C:\\Users\\migue\\Desktop\\credencial.pdf");

                } catch (Exception x) {
                    System.out.println("Error: " + x.getMessage().toString());
                }

            }
        });

    }

    private void BotonAbrir() {

        boton = new JButton("Abrir PDF");
        boton.setBounds(560, 485, 120, 40);
        boton.setForeground(java.awt.Color.black);
        boton.setFont(new java.awt.Font("Baskerville", java.awt.Font.CENTER_BASELINE, 15));
        boton.setEnabled(true);

        panel.add(boton);

        ActionListener accion = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                try {
                    File path = new File("C:\\Users\\migue\\Desktop\\credencial.pdf");
                    Desktop.getDesktop().open(path);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        };

        boton.addActionListener(accion);

    }

    private void BotonImagen() {

        boton = new JButton("Imagen");
        boton.setBounds(500, 35, 120, 40);
        boton.setForeground(java.awt.Color.black);
        boton.setFont(new java.awt.Font("Baskerville", java.awt.Font.CENTER_BASELINE, 15));
        boton.setEnabled(true);
        panel.add(boton);

        ActionListener accion = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                 
                JFileChoose();
            }
        };

        boton.addActionListener(accion);

    }

    public void JFileChoose() {

        JFileChooser ft = new JFileChooser();
        ft.setMultiSelectionEnabled(false);
        
        if (ft.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            rsdragdropfiles.RSDragDropFiles.setCopiar(ft.getSelectedFile().toString(), "C:\\Users\\migue\\Desktop\\INE\\fondo.png");
        }

    }

}
