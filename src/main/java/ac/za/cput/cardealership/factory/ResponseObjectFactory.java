package ac.za.cput.cardealership.factory;

import ac.za.cput.cardealership.domain.ResponseObject;

public class ResponseObjectFactory{

    public  static ResponseObject getResponseObject(String responseCode , String responseDesc){
        return  new ResponseObject(responseCode, responseDesc);


    }


}
