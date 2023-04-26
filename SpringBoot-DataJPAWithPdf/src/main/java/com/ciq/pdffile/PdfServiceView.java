package com.ciq.pdffile;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.example.model.Student;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.FontFactoryImp;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfCell;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;

import net.bytebuddy.asm.Advice.OffsetMapping.Target.ForStackManipulation.Writable;

public class PdfServiceView {
	
	private List<Student> listsStudents;

	public PdfServiceView(List<Student> listsStudents) {
		this.listsStudents = listsStudents;
	}
	
	private void writeTableHeader (PdfPTable table) {
		PdfPCell cell= new PdfPCell();
		cell.setBackgroundColor(Color.BLUE);
		cell.setPadding(5);
		
		Font font= FontFactory.getFont(FontFactory.HELVETICA);
		font.setColor(Color.WHITE);

		cell.setPhrase(new Phrase("Student Id", font));

		table.addCell(cell);

		cell.setPhrase(new Phrase("Student Name", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase("Student Scl", font));
		table.addCell(cell);

		
		
	}
	private void writeTableData(PdfPTable table) {
		for (Student s : listsStudents) {
			table.addCell(String.valueOf(s.getId()));
			table.addCell(s.getName());
			table.addCell(s.getScl());
		}
	}
	
		public void export(HttpServletResponse response) throws DocumentException, IOException {
			Document document = new Document(PageSize.A4);
			PdfWriter.getInstance(document, response.getOutputStream());

			document.open();
			Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
			font.setSize(18);
			font.setColor(Color.BLUE);

			Paragraph p = new Paragraph("LIST OF STUDENTS", font);
			p.setAlignment(Paragraph.ALIGN_CENTER);

			document.add(p);

			PdfPTable table = new PdfPTable(3);
			table.setWidthPercentage(100f);
			table.setWidths(new float[] { 1.5f, 3.5f, 3.0f});
			table.setSpacingBefore(10);

			writeTableHeader(table);
			writeTableData(table);

			document.add(table);

			document.close();

		}

}
