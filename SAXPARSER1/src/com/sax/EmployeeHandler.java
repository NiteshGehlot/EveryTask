package com.sax;

import jdk.internal.org.xml.sax.Attributes;
import jdk.internal.org.xml.sax.SAXException;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;

public class EmployeeHandler extends DefaultHandler {

    boolean isFirstName = false;
    boolean isLastName = false;
    boolean isSalary = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        if (qName.equalsIgnoreCase("employee")) {
            System.out.println("Start Element: " + qName);

            String sid = attributes.getValue("sid");
            System.out.println("Sid : " + sid);

        } else if (qName.equalsIgnoreCase("firstName")) {
            isFirstName = true;
        } else if (qName.equalsIgnoreCase("lastName")) {
            isLastName = true;
        } else if (qName.equalsIgnoreCase("salary")) {
            isSalary = true;
        }

    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        if (qName.equalsIgnoreCase("employee")) {

            System.out.println("End Element: " + qName);

        }

    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if (isFirstName) {

            System.out.println("First Name : " + new String(ch, start, length));

            isFirstName = false;
        } else if (isLastName) {
            System.out.println("Last Name: " + new String(ch, start, length));
            isLastName = false;
        } else if (isSalary) {
            System.out.println("Salary: " + new String(ch, start, length));
            isSalary = false;
        }

    }
}
