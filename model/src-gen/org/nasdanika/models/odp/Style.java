/**
 */
package org.nasdanika.models.odp;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ODF automatic/common style � flattened name/family + properties map,
 * not the full ODF style model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.odp.Style#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.odp.Style#getFamily <em>Family</em>}</li>
 *   <li>{@link org.nasdanika.models.odp.Style#getParentStyleName <em>Parent Style Name</em>}</li>
 *   <li>{@link org.nasdanika.models.odp.Style#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.odp.OdpPackage#getStyle()
 * @model
 * @generated
 */
public interface Style extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.odp.OdpPackage#getStyle_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.odp.Style#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  graphic | paragraph | text | presentation | drawing-page
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Family</em>' attribute.
	 * @see #setFamily(String)
	 * @see org.nasdanika.models.odp.OdpPackage#getStyle_Family()
	 * @model unique="false"
	 * @generated
	 */
	String getFamily();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.odp.Style#getFamily <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' attribute.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(String value);

	/**
	 * Returns the value of the '<em><b>Parent Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Style Name</em>' attribute.
	 * @see #setParentStyleName(String)
	 * @see org.nasdanika.models.odp.OdpPackage#getStyle_ParentStyleName()
	 * @model unique="false"
	 * @generated
	 */
	String getParentStyleName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.odp.Style#getParentStyleName <em>Parent Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Style Name</em>' attribute.
	 * @see #getParentStyleName()
	 * @generated
	 */
	void setParentStyleName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' map.
	 * @see org.nasdanika.models.odp.OdpPackage#getStyle_Properties()
	 * @model mapType="org.nasdanika.models.nxcore.StringToStringMapEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EMap<String, String> getProperties();

} // Style
