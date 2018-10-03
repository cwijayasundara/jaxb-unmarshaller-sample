package com.cham.jaxbunmarshaller;

import com.cham.dummy.schema.audit._0._1.AuditRequest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBUnmarshallerExample {

    public static void main(String[] args) {

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance( "com.cham.dummy.schema.audit._0._1" );
            Unmarshaller jaxbContextUnmarshaller = jaxbContext.createUnmarshaller();
            JAXBElement jaxbElement = (JAXBElement)jaxbContextUnmarshaller.unmarshal(new File( "src/main/resources/Audit.xml"));
            AuditRequest auditRequest = (AuditRequest)jaxbElement.getValue();
            System.out.println(auditRequest.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
