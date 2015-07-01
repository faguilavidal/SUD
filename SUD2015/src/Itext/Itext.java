package Itext;
import GUI.ControlIngreso;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Itext {
    
    //****ERROR*** Se pide listado de juegos por nombre//
    //Genera reporte con listado de todos los videojuegos en la Base de Datos.
    public void generarReporteListadoSUD()        {
        try 
        {
            Document document = new Document(PageSize.LEGAL.rotate());
            PdfWriter.getInstance(document,new FileOutputStream("ListadoPersonasSUD.pdf"));
            //PdfWriter.getInstance(document,new FileOutputStream(
            //System.getProperty("user.dir")+getClass().getResource("\\Reportes\\ListadoVideoJuegos.pdf")));
            document.open();
            document.add(new Paragraph("                                             "
                                       + "Listado De Personas SOLO UN DIOS 2015",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD,BaseColor.BLACK)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(8);
            float[] medidaCeldas = {3.5f, 8.5f, 3.5f, 1.5f, 5.5f, 3.5f, 5.0f, 1.5f};
            table.setWidths(medidaCeldas);
            PdfPCell cell1 = new PdfPCell(new Paragraph("Rut",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.BLACK)));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Nombre",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.BLACK)));
            PdfPCell cell3 = new PdfPCell(new Paragraph("Contacto",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.BLACK)));
            PdfPCell cell4 = new PdfPCell(new Paragraph("Folio",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.BLACK)));
            PdfPCell cell5 = new PdfPCell(new Paragraph("Alojamiento",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.BLACK)));
            PdfPCell cell6 = new PdfPCell(new Paragraph("Ciudad",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.BLACK)));
            PdfPCell cell7 = new PdfPCell(new Paragraph("Iglesia",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.BLACK)));
            PdfPCell cell8 = new PdfPCell(new Paragraph("Año",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.BLACK)));
            cell1.setColspan(1);
            cell2.setColspan(1);
            cell3.setColspan(1);
            cell4.setColspan(1);
            cell5.setColspan(1);
            cell6.setColspan(1);
            cell7.setColspan(1);
            cell8.setColspan(1);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell7.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell8.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.addCell(cell4);
            table.addCell(cell5);
            table.addCell(cell6);
            table.addCell(cell7);
            table.addCell(cell8);
            
            ArrayList<BLL.Persona> listado = new BLL.Persona().listadoPersonas();
            DecimalFormat formatoRut = new DecimalFormat("#,###");
            for(BLL.Persona p: listado)   
            { 
                String rut = formatoRut.format(p.getRut()) + "-" + new ControlIngreso().obtenerDigitoVerificador(p.getRut());
                String nombre=  p.getNombre();  
                String contacto =String.valueOf(p.getContacto());
                String folio =String.valueOf(p.getFolio());
                String alojamiento = String.valueOf(p.getAlojamiento());
                String ciudad = new BLL.Ciudad().obtenerNombreCiudad(p.getIdciudad()); 
                String iglesia = new BLL.Iglesia().obtenerNombreIglesia(p.getIdiglesia());
                String año =String.valueOf(p.getAño()); 

                table.addCell(rut);
                table.addCell(nombre);
                table.addCell(contacto);
                table.addCell(folio);
                table.addCell(alojamiento);
                table.addCell(ciudad);
                table.addCell(iglesia);
                table.addCell(año);
            }
            document.add(table);
            JOptionPane.showMessageDialog(null,"Reporte Guardado");
            document.close();
        } 
        catch (DocumentException e) 
        {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
         catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
        
    }

    
    public void generarReporteMovimientosSUD(){
        try 
        {
            Document document = new Document(PageSize.LEGAL.rotate());
            PdfWriter.getInstance(document,new FileOutputStream("ListadoMovimientoSUD.pdf"));
            //PdfWriter.getInstance(document,new FileOutputStream(
            //System.getProperty("user.dir")+getClass().getResource("\\Reportes\\ListadoVideoJuegos.pdf")));
            document.open();
            document.add(new Paragraph("                                             "
                                       + "Listado De Movimientos SOLO UN DIOS 2015",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD,BaseColor.BLACK)));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            PdfPTable table = new PdfPTable(5);
            float[] medidaCeldas = {1.5f, 1.5f, 1.5f, 10.5f, 1.5f};
            table.setWidths(medidaCeldas);
            PdfPCell cell1 = new PdfPCell(new Paragraph("Codigo",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.BLACK)));
            PdfPCell cell2 = new PdfPCell(new Paragraph("Registro",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.BLACK)));
            PdfPCell cell3 = new PdfPCell(new Paragraph("Monto",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.BLACK)));
            PdfPCell cell4 = new PdfPCell(new Paragraph("Detalle",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.BLACK)));
            PdfPCell cell5 = new PdfPCell(new Paragraph("Año",FontFactory.getFont(FontFactory.TIMES_BOLD,14,Font.BOLD,BaseColor.BLACK)));
            cell1.setColspan(1);
            cell2.setColspan(1);
            cell3.setColspan(1);
            cell4.setColspan(1);
            cell5.setColspan(1);
            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.addCell(cell4);
            table.addCell(cell5);
            
            ArrayList<BLL.Movimiento> listado = new BLL.Movimiento().listadoMovimientos();
            for(BLL.Movimiento p: listado)   
            {
                String codigo = String.valueOf(p.getCodigo());
                String registro =  p.getMovimiento();
                String monto = String.valueOf(p.getMonto());
                String detalle = p.getDetalle();
                String año = String.valueOf(p.getAño());

                table.addCell(codigo);
                table.addCell(registro);
                table.addCell(monto);
                table.addCell(detalle);
                table.addCell(año);
            }
            document.add(table);
            JOptionPane.showMessageDialog(null,"Reporte Guardado");
            document.close();
        } 
        catch (DocumentException e) 
        {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
         catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error: "+e);
        }
        
    }
    
}