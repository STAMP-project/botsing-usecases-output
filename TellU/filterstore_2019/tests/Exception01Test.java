package no.tellu.lib.data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import no.tellu.lib.data.DataGroupNode;
import no.tellu.lib.data.DataHandleImpl;
import no.tellu.lib.data.DataValueNode;
import no.tellu.lib.data.MetaItemNode;

@RunWith(JUnit4.class)
public class Exception01Test {
	
	@Test
	public void test_f2() throws DataNotFoundException {
		DataGroupNode dataGroupNode0 = new DataGroupNode();
		DataHandleImpl dataHandleImpl0 = new DataHandleImpl(dataGroupNode0);
		float float0 = 0.0F;
		float float1 = dataHandleImpl0.getFloat(dataGroupNode0.name, float0);
		DataValueNode dataValueNode0 = new DataValueNode(dataGroupNode0.name);
		dataHandleImpl0.resetNode();
		String string0 = "";
		DataPredicate dataPredicate0 = new DataPredicate(string0);
		DataGroupNode dataGroupNode1 = dataGroupNode0.addNodeRaw(dataValueNode0);
		dataGroupNode0.getChildNodes(dataGroupNode1.name, dataPredicate0);
		String string1 = "LQaMzB&S$['";
		String string2 = "";
		dataHandleImpl0.getString(string2);
		dataGroupNode0.isValid();
		int int0 = 3;
		Integer integer0 = new Integer(int0);
		MetaItemNode metaItemNode0 = new MetaItemNode(dataValueNode0.name, integer0);
		MergeHandle mergeHandle0 = new MergeHandle();
		String string3 = "$U $$";
		DataValueNode dataValueNode1 = mergeHandle0.getValueNode(string3);
		DataValueNode dataValueNode2 = new DataValueNode(metaItemNode0, dataValueNode1);
		dataValueNode2.getChildNodes(dataValueNode1.name, dataPredicate0);
		dataGroupNode1.addNode((DataNode) dataValueNode0);
		dataGroupNode0.clearModified();
		String string4 = "<l5?";
		dataHandleImpl0.setValue(string4, mergeHandle0);
		mergeHandle0.nextNode();
		String string5 = "9";
		String string6 = "[";
		mergeHandle0.getLong(string6);
		String string7 = "Already has child node with this name";
		dataHandleImpl0.getFloat(dataGroupNode1.name, float1);
	}
}