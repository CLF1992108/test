package clf.test;
import java.rmi.RemoteException;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import javax.xml.namespace.QName;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import org.apache.axis.encoding.XMLType;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

  
public class WebserviceTest { 
	public static Call getCallQame(String endPoint, String nameSpace,
			String operationName, LinkedHashMap<String, QName> inParameters,
			QName returnType) throws ServiceException {
		// 瀹氫箟service瀵硅薄
		Service service = new Service();
		// 鍒涘缓璋冪敤鐨刢all瀵硅薄
		Call call = (Call) service.createCall();
		// 璁剧疆鐩爣鍦板潃锛屽嵆webservice璺緞
		call.setTargetEndpointAddress(endPoint);
		// 璁剧疆鎿嶄綔鍚嶇О锛屽嵆鏂规硶鍚嶇О
		call.setOperationName(new QName(nameSpace, operationName));

		// 璁剧疆鏂规硶鍙傛暟
		for (Entry<String, QName> entry : inParameters.entrySet()) {
			call.addParameter(new QName(nameSpace,  entry.getKey()), entry.getValue(),
					ParameterMode.IN);
		}
		// 璁剧疆杩斿洖鍊肩被鍨�
		call.setReturnType(returnType);
		return call;
	}
	
	public static Call getCall(String endPoint, String nameSpace,
			String operationName, LinkedHashMap<String, QName> inParameters,
			QName returnType) throws ServiceException {
		// 瀹氫箟service瀵硅薄
		Service service = new Service();
		// 鍒涘缓璋冪敤鐨刢all瀵硅薄
		Call call = (Call) service.createCall();
		// 璁剧疆鐩爣鍦板潃锛屽嵆webservice璺緞
		call.setTargetEndpointAddress(endPoint);
		// 璁剧疆鎿嶄綔鍚嶇О锛屽嵆鏂规硶鍚嶇О
		call.setOperationName(new QName(nameSpace, operationName));

		// 璁剧疆鏂规硶鍙傛暟
		for (Entry<String, QName> entry : inParameters.entrySet()) {
			call.addParameter(entry.getKey(), entry.getValue(),
					ParameterMode.IN);
		}

//       call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
//       call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
//       call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
	
		// 璁剧疆杩斿洖鍊肩被鍨�
		call.setReturnType(returnType);
		return call;
	}
	
    public static void main(String[] args) throws RemoteException { 
    	System.out.println(11);
    	LinkedHashMap<String, QName> inParameters = new LinkedHashMap<String, QName>();
		inParameters.put("payload", XMLType.XSD_STRING);
		Call call1 = null;
		try {System.out.println(11);
			call1 = getCall("http://127.0.0.1:5566/soap?wsdl","http://ws.api.cloud.aomai.com/", "service", inParameters, XMLType.XSD_STRING);
			System.out.println(22);
			call1.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String eid = "asdasd";
		String data = "{\"eid\":\""+eid+"\",\"uid\":\""+1+"\",\"type\":\""+1+"\",\"data\":"+1+",\"sign\":\""+1+"\"}";
		String s1="{\"data\":{\"createDateTime\":1545099566908,\"createUser\":\"ADMIN\",\"materialCode\":\"50895535\",\"modifyDateTime\":1545099566908,\"modifyUser\":\"ADMIN\",\"nationalStandardsSN\":\"03OPE11P0000918CJ0000002\",\"productSN\":\"00000150809553599900Y03OPE11P0000918CJ0000002\",\"prosn\":\"00000150809553599900Y03OPE11P0000918CJ0000002\",\"siteCode\":\"900Y\",\"wonum\":\"SZ20181205001\",\"workcenterCode\":\"PL72\"},\"type\":\"WorkOrder_ProductSN\"}";
		//String data = "333";
		//JSONObject data1=JSON.parseObject(data);
		String[] strs1 = {data};
		String res = (String) call1.invoke(strs1);
    }
        
}  