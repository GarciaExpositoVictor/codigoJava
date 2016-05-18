/**
 * BicipalmaWSDLSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mobi.mobipalma.api.docs;

public class BicipalmaWSDLSOAPSkeleton implements mobi.mobipalma.api.docs.BicipalmaWSDL_PortType, org.apache.axis.wsdl.Skeleton {
    private mobi.mobipalma.api.docs.BicipalmaWSDL_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("estadoEstacion", _params, new javax.xml.namespace.QName("", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("https://api.mobipalma.mobi/docs/", "estadoEstacion"));
        _oper.setSoapAction("https://api.mobipalma.mobi/docs/estadoEstacion");
        _myOperationsList.add(_oper);
        if (_myOperations.get("estadoEstacion") == null) {
            _myOperations.put("estadoEstacion", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("estadoEstacion")).add(_oper);
    }

    public BicipalmaWSDLSOAPSkeleton() {
        this.impl = new mobi.mobipalma.api.docs.BicipalmaWSDLSOAPImpl();
    }

    public BicipalmaWSDLSOAPSkeleton(mobi.mobipalma.api.docs.BicipalmaWSDL_PortType impl) {
        this.impl = impl;
    }
    public java.lang.String estadoEstacion(java.lang.String in) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.estadoEstacion(in);
        return ret;
    }

}
