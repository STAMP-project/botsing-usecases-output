package no.tellu.lib.data.model;

import java.util.LinkedList;

import org.eclipse.jetty.server.Server;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.google.gson.JsonPrimitive;

import no.tellu.cloud.mediator.ServiceComponent;
import no.tellu.cloud.mediator.api.Envelope;
import no.tellu.cloud.mediator.rabbitmq.RabbitMQMediator;
import no.tellu.cloud.mediator.test.TestService;
import no.tellu.cloud.mediatorprotocol.MediatorMessage;
import no.tellu.cloud.protocol.notification.NotificationMessage;
import no.tellu.lib.data.BooleanOp;
import no.tellu.lib.data.DataGroupNode;
import no.tellu.lib.data.DataNode;
import no.tellu.lib.data.DataNotFoundException;
import no.tellu.lib.data.MetaItemNode;
import no.tellu.lib.data.model.DataModel;
import no.tellu.lib.data.model.DataModelHandle;
import no.tellu.lib.data.model.ParsedExpr;
import no.tellu.lib.log.Logger;

@RunWith(JUnit4.class)
public class Exception02Test {
	
	@Test
	public void test02_f3() throws DataNotFoundException {
		DataGroupNode dataGroupNode0 = new DataGroupNode();
		dataGroupNode0.getGroupNode(dataGroupNode0.name);
		LinkedList<DataNode> linkedList0 = new LinkedList<DataNode>();
		String string0 = "h7^lcVeO?~";
		Logger logger0 = new Logger(string0);
		DataModel dataModel0 = new DataModel(logger0);
		String string1 = ". no";
		DataModelHandle dataModelHandle0 = new DataModelHandle(dataModel0, linkedList0, logger0.VAR_OBJECT);
		dataModelHandle0.commitTransaction();
		String string2 = "";
		Logger logger1 = new Logger(string2);
		int int0 = (-485608161);
		String string3 = "//";
		int int1 = 2128;
		MetaItemNode.DataType metaItemNode_DataType0 = MetaItemNode.DataType.INTEGER;
		String string4 = "x6 zJ)=s@#b`$#x\\9";
		MetaItemNode.DataType metaItemNode_DataType1 = MetaItemNode.DataType.INTEGER;
		ParsedExpr parsedExpr0 = new ParsedExpr(string4, logger0.VAR_OBJECT, logger1.INFO, metaItemNode_DataType1);
		parsedExpr0.onDataValueUpdate(dataModelHandle0);
		String string5 = "G n#/";
		dataModelHandle0.deactivateProvider(parsedExpr0, string5);
		String string6 = "xemh=<a[c`";
		DataModel dataModel1 = new DataModel(logger0, logger1.ERROR);
		DataModelHandle dataModelHandle1 = dataModel1.rootHandle;
		String string7 = "X6.Fv#q0r Vw";
		String string8 = "Y^ wlu^qT5eDIN&";
		Object object0 = null;
		dataModelHandle1.setValue(logger1.VAR_OBJECT, object0);
	}
	
	@Test
	public void test02_f4() {
		String string0 = "";
		boolean boolean0 = false;
		TestService testService0 = new TestService(string0, boolean0);
		Object.registerNatives();
		Server server0 = testService0.getServer();
		ServiceComponent.initEnvironment();
		testService0.start();
		testService0.getResourceFinder();
		String string1 = "aM ";
		testService0.port(string1);
		ServiceComponent serviceComponent0 = new ServiceComponent(server0.STARTED);
		String string2 = "";
		ServiceComponent serviceComponent1 = new ServiceComponent(string2);
		serviceComponent0.getMediator();
		String string3 = null;
		Long long0 = null;
		BooleanOp booleanOp0 = BooleanOp.Less;
		Boolean boolean1 = booleanOp0.evalNum(long0, long0);
		JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean1);
		Class<RabbitMQMediator> class0 = RabbitMQMediator.class;
		Envelope envelope0 = new Envelope(jsonPrimitive0, class0);
		serviceComponent1.send(string3, long0, envelope0);
		serviceComponent1.initFromConfig();
		testService0.stop();
		NotificationMessage notificationMessage0 = new NotificationMessage();
		Envelope envelope1 = new Envelope((MediatorMessage) notificationMessage0);
		testService0.onMessage(envelope1);
	}
}