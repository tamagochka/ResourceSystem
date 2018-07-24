package my.tamagochka.ResourceSystem;

import my.tamagochka.ResourceSystem.resources.DBParametersResource;
import my.tamagochka.ResourceSystem.sax.ReadXMLFileSAX;

public class Main {

    public static void main(String[] args) {
        DBParametersResource resource = (DBParametersResource) ReadXMLFileSAX.read("./data/DBParametersResource.xml");
        System.out.println(resource);
    }
}
