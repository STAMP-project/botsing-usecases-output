package no.tellu.findit.domain;

import java.time.Instant;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.jetty.webapp.ClasspathPattern;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import io.prometheus.client.CollectorRegistry;
import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;
import no.tellu.findit.cmd.FindCustomerWithAddrLookupDataCmd;
import no.tellu.findit.domain.PositionImpl;
import no.tellu.findit.domain.RuleImpl;
import no.tellu.findit.domain.SensorDeviceConfigurationImpl;
import no.tellu.findit.domain.SensorDeviceImpl;
import no.tellu.findit.services.AddressLookupServiceImpl;
import no.tellu.findit.services.DatabaseServiceImpl;
import no.tellu.findit.services.ServiceException;
import no.tellu.security.jpa.BaseAccount;

@RunWith(JUnit4.class)
public class Exception09Test {
	
	@Test
	public void test09_f2() {
		PositionImpl positionImpl0 = new PositionImpl();
		List<String> list0 = null;
		positionImpl0.setInsideZones(list0);
		int int0 = (-1091);
		Integer integer0 = new Integer(int0);
		positionImpl0.setCourse(integer0);
		//Tag tag0 = mock(Tag.class, new ViolatedAssumptionAnswer());
		//positionImpl0.setTag(tag0);
		positionImpl0.setInsideZones(list0);
		LinkedList<String> linkedList0 = new LinkedList<String>();
		positionImpl0.setInsideZones(linkedList0);
		String string0 = ")T&1$9,~`>*RG<=ng\\";
		positionImpl0.setInsideZonesFullString(string0);
		positionImpl0.setInsideZones(linkedList0);
		positionImpl0.duplicate();
		positionImpl0.isPositionOutOfOrder();
	}
	
	@Test
	public void test09_f3() {
		PositionImpl positionImpl0 = new PositionImpl();
		Date date0 = null;
		positionImpl0.setLocationTimeStamp(date0);
		HashMap<Long, Map<String, Object>> hashMap0 = new HashMap<Long, Map<String, Object>>();
		positionImpl0.setInsideZonesFull(hashMap0);
		positionImpl0.getY();
		String string0 = "0^F9p/";
		positionImpl0.setOriginalMessage(string0);
		Long long0 = positionImpl0.getVersion();
		RuleImpl ruleImpl0 = new RuleImpl();
		Long long1 = ruleImpl0.getVersion();
		boolean boolean0 = false;
		BaseAccount baseAccount0 = new BaseAccount();
		Long long2 = baseAccount0.getId();
		SensorDeviceConfigurationImpl sensorDeviceConfigurationImpl0 = new SensorDeviceConfigurationImpl();
		Long long3 = sensorDeviceConfigurationImpl0.getId();
		long long4 = 0L;
		Long long5 = new Long(long4);
		Long long6 = ruleImpl0.getVersion();
		SensorDeviceImpl sensorDeviceImpl0 = new SensorDeviceImpl(long0, long1, boolean0, long2, long3, long5, long6);
		Map<String, String> map0 = sensorDeviceImpl0.getNextTimeoutPerFilter();
		positionImpl0.setPermanentProperties(map0);
		positionImpl0.setSource(map0);
		positionImpl0.getFloor();
		positionImpl0.setInsideZonesFullString(string0);
		double double0 = 0.0;
		Double double1 = new Double(double0);
		positionImpl0.setAccuracy(double1);
		positionImpl0.setInsideZonesFullString(string0);
		positionImpl0.getMd5();
		Long long7 = positionImpl0.getVersion();
		positionImpl0.getZ();
		positionImpl0.getReceptionTimeStamp();
		//PositionImpl.__STATIC_RESET();
		String string1 = null;
		String[] stringArray0 = new String[3];
		stringArray0[0] = string0;
		stringArray0[1] = string0;
		stringArray0[2] = string1;
		positionImpl0.setSource(string1, long7, string0, string0, stringArray0);
	}
	
	@Test
	public void test09_f4() throws ServiceException {
		AccessTokenImpl accessTokenImpl0 = new AccessTokenImpl();
		Class<Integer> class0 = Integer.TYPE;
		Carrier carrier0 = Carrier.DTMF;
		JsonConfig jsonConfig0 = new JsonConfig();
		JSONArray jSONArray0 = JSONArray.fromObject((Object) carrier0, jsonConfig0);
		ClasspathPattern.ByPackage classpathPattern_ByPackage0 = new ClasspathPattern.ByPackage();
		JSONArray jSONArray1 = JSONArray.fromObject((Object) classpathPattern_ByPackage0, jsonConfig0);
		jSONArray0.retainAll((Collection) jSONArray1);
		Long long0 = null;
		long long1 = 3155695200000L;
		Long long2 = new Long(long1);
		FindCustomerWithAddrLookupDataCmd findCustomerWithAddrLookupDataCmd0 = new FindCustomerWithAddrLookupDataCmd(long2);
		Customer customer0 = findCustomerWithAddrLookupDataCmd0.getCustomer();
		DatabaseServiceImpl databaseServiceImpl0 = new DatabaseServiceImpl();
		AddressLookupServiceImpl addressLookupServiceImpl0 = AddressLookupServiceImpl.createInstance(databaseServiceImpl0);
		Double double0 = new Double(jsonConfig0.MODE_OBJECT_ARRAY);
		boolean boolean0 = true;
		CollectorRegistry collectorRegistry0 = new CollectorRegistry(boolean0);
		String string0 = "]FVlw1^f=e";
		Double double1 = collectorRegistry0.getSampleValue(string0);
		double double2 = (-122.623505877589);
		PositionImpl positionImpl0 = new PositionImpl(jsonConfig0.MODE_SET, double2);
		Double double3 = positionImpl0.getY();
		Instant instant0 = Instant.EPOCH;
		Date date0 = Date.from(instant0);
		ServiceProviderImpl serviceProviderImpl0 = new ServiceProviderImpl();
		Boolean boolean1 = serviceProviderImpl0.getQqMapEnabled();
		AssetTypeImpl assetTypeImpl0 = new AssetTypeImpl();
		Map<String, String> map0 = assetTypeImpl0.getAdditionalProperties();
		PositionImpl positionImpl1 = (PositionImpl)DomainFactory.createPosition(double0, double0, double1, double3, date0, boolean1, carrier0, map0);
		addressLookupServiceImpl0.appendListOfZones((Position) positionImpl1, customer0, (List<Location>) jSONArray1);
	}
}