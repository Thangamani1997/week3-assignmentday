package week3Assignment;

public class Element extends Button
{
	public static void main(String[] args)
	{
		System.out.println("Methods support for Element Class");
		Element ele = new Element();
		ele.click();
		ele.setText("Prithiviga Sri");
		ele.submit();
		System.out.println("__________________________________________________________________");
		System.out.println("Methods support for TextField Class");
		TextField text = new TextField();
		text.gettex();
		text.click();
		text.setText("Gayu");
		System.out.println("__________________________________________________________________");
		System.out.println("Methods support for Checkbox Button Class");
		CheckboxButton checkbox = new CheckboxButton();
		checkbox.clickCheckButton();
		checkbox.click();
		checkbox.setText("Saru");
		checkbox.submit();
		System.out.println("__________________________________________________________________");
		System.out.println("Methods support for Radio Button Class");
		RadioButton radio = new RadioButton();
		radio.selectRadioButton();
		radio.click();
		radio.setText("Ammu");
		radio.submit();
		System.out.println("__________________________________________________________________");
		System.out.println("Methods support for Radio Button Class");
		Button but = new Button();
		but.submit();
		but.click();
		but.setText("Thanga");
		
	}
}
