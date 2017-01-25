////////////////////////////////////////////////////////////////////////
//
// TextNode.java
//
// This file was generated by MapForce 2017sp2.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the MapForce Documentation for further details.
// http://www.altova.com/mapforce
//
////////////////////////////////////////////////////////////////////////

package com.altova.text;

public class TextNode implements ITextNode {
	private ITextNode m_Parent = null;

	private TextNodeList m_Children = null;

	private String m_Name = "";

	private String m_Value = "";

	private byte m_NodeClass = ITextNode.Undefined;

	public TextNode(ITextNode parent, String name) {
		this(parent, name, ITextNode.Undefined);
	}

	public TextNode(ITextNode parent, String name, byte nodeClass) {
		m_Name= name;
		m_NodeClass = nodeClass;
		m_Children = new TextNodeList(this);
		m_Parent = parent;
		if (m_Parent != null)
			m_Parent.getChildren().add(this);
	}

	public ITextNode getRoot() {
		return m_Parent.getRoot();
	}

	public ITextNode getParent() {
		return m_Parent;
	}

	public void setParent(ITextNode rhs) {
		m_Parent = rhs;
	}

	public ITextNodeList getChildren() {
		return m_Children;
	}

	public String getName() {
		return m_Name;
	}

	public void setName(String name) {
		m_Name = name;
	}

	public String getValue() {
		return m_Value;
	}

	public void setValue(String value) {
		m_Value = value;
	}

	public boolean isNull() {
		return false;
	}

	public byte getNodeClass() {
		return m_NodeClass;
	}

	public void setNodeClass(byte rhs) {
		m_NodeClass = rhs;
	}
}