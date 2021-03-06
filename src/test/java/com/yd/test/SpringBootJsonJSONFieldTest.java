package com.yd.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yd.test.bean.JsonFieldBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes=SpringBootJsonApplication.class)
@RunWith(SpringRunner.class)
public  class SpringBootJsonApplicationTests {

	//注解@JSONField强转
	@Test 
	public void JSONField() {
		String response = "{\"jsonrpc\":\"2.0\",\"result\":[{\"itemid\":\"28737\",\"type\":\"3\",\"snmp_community\":\"\",\"snmp_oid\":\"\",\"hostid\":\"10084\",\"name\":\"FTP service is running\",\"key_\":\"net.tcp.service[ftp]\",\"delay\":\"1m\",\"history\":\"1w\",\"trends\":\"365d\",\"status\":\"0\",\"value_type\":\"3\",\"trapper_hosts\":\"\",\"units\":\"\",\"snmpv3_securityname\":\"\",\"snmpv3_securitylevel\":\"0\",\"snmpv3_authpassphrase\":\"\",\"snmpv3_privpassphrase\":\"\",\"formula\":\"\",\"error\":\"\",\"lastlogsize\":\"0\",\"logtimefmt\":\"\",\"templateid\":\"23644\",\"valuemapid\":\"1\",\"params\":\"\",\"ipmi_sensor\":\"\",\"authtype\":\"0\",\"username\":\"\",\"password\":\"\",\"publickey\":\"\",\"privatekey\":\"\",\"mtime\":\"0\",\"flags\":\"0\",\"interfaceid\":\"1\",\"port\":\"\",\"description\":\"\",\"inventory_link\":\"0\",\"lifetime\":\"30d\",\"snmpv3_authprotocol\":\"0\",\"snmpv3_privprotocol\":\"0\",\"state\":\"0\",\"snmpv3_contextname\":\"\",\"evaltype\":\"0\",\"jmx_endpoint\":\"\",\"master_itemid\":\"0\",\"timeout\":\"3s\",\"url\":\"\",\"query_fields\":[],\"posts\":\"\",\"status_codes\":\"200\",\"follow_redirects\":\"1\",\"post_type\":\"0\",\"http_proxy\":\"\",\"headers\":[],\"retrieve_mode\":\"0\",\"request_method\":\"0\",\"output_format\":\"0\",\"ssl_cert_file\":\"\",\"ssl_key_file\":\"\",\"ssl_key_password\":\"\",\"verify_peer\":\"0\",\"verify_host\":\"0\",\"allow_traps\":\"0\",\"lastclock\":\"1598946657\",\"lastns\":\"402795671\",\"lastvalue\":\"0\",\"prevvalue\":\"0\"}],\"id\":1}";

        JSONArray array = JSON.parseObject(response).getJSONArray("result");
        try {
			for (Object obj: array){
				JsonFieldBean item = JSONObject.parseObject(obj.toString(),JsonFieldBean.class);
	            System.out.println(item);
	        }
        
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//注解@JSONField强转
	@Test
	public void ObjectMapper() {
		String response = "{\"jsonrpc\":\"2.0\",\"result\":[{\"itemid\":\"28737\",\"type\":\"3\",\"snmp_community\":\"\",\"snmp_oid\":\"\",\"hostid\":\"10084\",\"name\":\"FTP service is running\",\"key_\":\"net.tcp.service[ftp]\",\"delay\":\"1m\",\"history\":\"1w\",\"trends\":\"365d\",\"status\":\"0\",\"value_type\":\"3\",\"trapper_hosts\":\"\",\"units\":\"\",\"snmpv3_securityname\":\"\",\"snmpv3_securitylevel\":\"0\",\"snmpv3_authpassphrase\":\"\",\"snmpv3_privpassphrase\":\"\",\"formula\":\"\",\"error\":\"\",\"lastlogsize\":\"0\",\"logtimefmt\":\"\",\"templateid\":\"23644\",\"valuemapid\":\"1\",\"params\":\"\",\"ipmi_sensor\":\"\",\"authtype\":\"0\",\"username\":\"\",\"password\":\"\",\"publickey\":\"\",\"privatekey\":\"\",\"mtime\":\"0\",\"flags\":\"0\",\"interfaceid\":\"1\",\"port\":\"\",\"description\":\"\",\"inventory_link\":\"0\",\"lifetime\":\"30d\",\"snmpv3_authprotocol\":\"0\",\"snmpv3_privprotocol\":\"0\",\"state\":\"0\",\"snmpv3_contextname\":\"\",\"evaltype\":\"0\",\"jmx_endpoint\":\"\",\"master_itemid\":\"0\",\"timeout\":\"3s\",\"url\":\"\",\"query_fields\":[],\"posts\":\"\",\"status_codes\":\"200\",\"follow_redirects\":\"1\",\"post_type\":\"0\",\"http_proxy\":\"\",\"headers\":[],\"retrieve_mode\":\"0\",\"request_method\":\"0\",\"output_format\":\"0\",\"ssl_cert_file\":\"\",\"ssl_key_file\":\"\",\"ssl_key_password\":\"\",\"verify_peer\":\"0\",\"verify_host\":\"0\",\"allow_traps\":\"0\",\"lastclock\":\"1598946657\",\"lastns\":\"402795671\",\"lastvalue\":\"0\",\"prevvalue\":\"0\"}],\"id\":1}";

        JSONArray array = JSON.parseObject(response).getJSONArray("result");
        try {
			for (Object obj: array){
				JsonFieldBean item = JSONObject.parseObject(obj.toString(),JsonFieldBean.class);
	            System.out.println(item);
	        }
        
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
