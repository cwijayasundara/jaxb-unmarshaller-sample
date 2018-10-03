execute mvn clean install. That will generate java classes based on the XSD in /target folder.
generate a sample XML using the XSD. Override the toString() of the base generated class if you need to print the content.

Note: JAXBContext & Unmarshaller creation is expensive so best to create this at the class level as a singleton.