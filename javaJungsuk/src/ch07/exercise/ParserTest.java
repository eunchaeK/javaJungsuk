package ch07.exercise;

class ParserManager{
	// 리턴타입이 Parseable 인터페이스 
	public static Parseable getParser(String type) {
		if(type.equals("XML")) {
			return new XMLParser();
		}else {
			return new HTMLParser();
		}
	}
}// end ParserManager


class XMLParser implements Parseable{
	@Override
	public void parse(String fileName) {
		/* 구문 분석작업 수행 코드 */
		System.out.println(fileName + "- XML parsing completed.");
	}
}// end XMLParser


class HTMLParser implements Parseable{
	@Override
	public void parse(String fileName) {
		/* 구문 분석작업 수행 코드 */
		System.out.println(fileName + "- HTML parsing completed.");
	}
}// end HTMLParser


public class ParserTest {
	public static void main(String[] args) {
		Parseable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
