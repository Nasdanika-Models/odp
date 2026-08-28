/**
 */
package org.nasdanika.models.odp;

import org.nasdanika.models.presentation.Shape;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  Preserved-but-not-modeled elements (charts, OLE, custom draw elements).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.odp.OpaqueElement#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.odp.OpaqueElement#getXml <em>Xml</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.odp.OdpPackage#getOpaqueElement()
 * @model
 * @generated
 */
public interface OpaqueElement extends Shape {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see org.nasdanika.models.odp.OdpPackage#getOpaqueElement_Kind()
	 * @model unique="false"
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.odp.OpaqueElement#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Serialized XML of the source element for lossless save.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xml</em>' attribute.
	 * @see #setXml(String)
	 * @see org.nasdanika.models.odp.OdpPackage#getOpaqueElement_Xml()
	 * @model unique="false"
	 * @generated
	 */
	String getXml();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.odp.OpaqueElement#getXml <em>Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml</em>' attribute.
	 * @see #getXml()
	 * @generated
	 */
	void setXml(String value);

} // OpaqueElement
