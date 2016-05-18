/**
 * BicipalmaWSDL_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mobi.mobipalma.api.docs;

public class BicipalmaWSDL_ServiceLocator extends org.apache.axis.client.Service implements mobi.mobipalma.api.docs.BicipalmaWSDL_Service {

    public BicipalmaWSDL_ServiceLocator() {
    }


    public BicipalmaWSDL_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BicipalmaWSDL_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BicipalmaWSDLSOAP
    private java.lang.String BicipalmaWSDLSOAP_address = "http://localhost:8080";

    public java.lang.String getBicipalmaWSDLSOAPAddress() {
        return BicipalmaWSDLSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BicipalmaWSDLSOAPWSDDServiceName = "BicipalmaWSDLSOAP";

    public java.lang.String getBicipalmaWSDLSOAPWSDDServiceName() {
        return BicipalmaWSDLSOAPWSDDServiceName;
    }

    public void setBicipalmaWSDLSOAPWSDDServiceName(java.lang.String name) {
        BicipalmaWSDLSOAPWSDDServiceName = name;
    }

    public mobi.mobipalma.api.docs.BicipalmaWSDL_PortType getBicipalmaWSDLSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BicipalmaWSDLSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBicipalmaWSDLSOAP(endpoint);
    }

    public mobi.mobipalma.api.docs.BicipalmaWSDL_PortType getBicipalmaWSDLSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mobi.mobipalma.api.docs.BicipalmaWSDLSOAPStub _stub = new mobi.mobipalma.api.docs.BicipalmaWSDLSOAPStub(portAddress, this);
            _stub.setPortName(getBicipalmaWSDLSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBicipalmaWSDLSOAPEndpointAddress(java.lang.String address) {
        BicipalmaWSDLSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mobi.mobipalma.api.docs.BicipalmaWSDL_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mobi.mobipalma.api.docs.BicipalmaWSDLSOAPStub _stub = new mobi.mobipalma.api.docs.BicipalmaWSDLSOAPStub(new java.net.URL(BicipalmaWSDLSOAP_address), this);
                _stub.setPortName(getBicipalmaWSDLSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BicipalmaWSDLSOAP".equals(inputPortName)) {
            return getBicipalmaWSDLSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "BicipalmaWSDL");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "BicipalmaWSDLSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BicipalmaWSDLSOAP".equals(portName)) {
            setBicipalmaWSDLSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
