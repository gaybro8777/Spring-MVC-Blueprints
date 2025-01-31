
package org.packt.erp.modules.service.impl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "InventoryServiceImpl", targetNamespace = "http://impl.service.modules.erp.packt.org/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface InventoryServiceImpl {


    /**
     * 
     * @return
     *     returns org.packt.erp.modules.service.impl.CatalogArray
     */
    @WebMethod
    @WebResult(name = "result", partName = "result")
    @Action(input = "http://impl.service.modules.erp.packt.org/InventoryServiceImpl/getProductsRequest", output = "http://impl.service.modules.erp.packt.org/InventoryServiceImpl/getProductsResponse")
    public CatalogArray getProducts();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://impl.service.modules.erp.packt.org/InventoryServiceImpl/addProductRequest", output = "http://impl.service.modules.erp.packt.org/InventoryServiceImpl/addProductResponse")
    public void addProduct(
        @WebParam(name = "arg0", partName = "arg0")
        InventoryForm arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns org.packt.erp.modules.service.impl.Catalog
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://impl.service.modules.erp.packt.org/InventoryServiceImpl/getProductRequest", output = "http://impl.service.modules.erp.packt.org/InventoryServiceImpl/getProductResponse")
    public Catalog getProduct(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @return
     *     returns org.packt.erp.modules.service.impl.UomArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://impl.service.modules.erp.packt.org/InventoryServiceImpl/getUnitMeasureRequest", output = "http://impl.service.modules.erp.packt.org/InventoryServiceImpl/getUnitMeasureResponse")
    public UomArray getUnitMeasure();

    /**
     * 
     * @return
     *     returns org.packt.erp.modules.service.impl.ArrayList
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://impl.service.modules.erp.packt.org/InventoryServiceImpl/getMaterialTypesRequest", output = "http://impl.service.modules.erp.packt.org/InventoryServiceImpl/getMaterialTypesResponse")
    public ArrayList getMaterialTypes();

}
