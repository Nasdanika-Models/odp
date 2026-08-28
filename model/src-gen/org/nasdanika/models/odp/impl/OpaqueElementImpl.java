/**
 */
package org.nasdanika.models.odp.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.odp.OdpPackage;
import org.nasdanika.models.odp.OpaqueElement;

import org.nasdanika.models.presentation.impl.ShapeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Opaque Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.odp.impl.OpaqueElementImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.nasdanika.models.odp.impl.OpaqueElementImpl#getXml <em>Xml</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpaqueElementImpl extends ShapeImpl implements OpaqueElement {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getXml() <em>Xml</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml()
	 * @generated
	 * @ordered
	 */
	protected static final String XML_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpaqueElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OdpPackage.Literals.OPAQUE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKind() {
		return (String)eDynamicGet(OdpPackage.OPAQUE_ELEMENT__KIND, OdpPackage.Literals.OPAQUE_ELEMENT__KIND, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(String newKind) {
		eDynamicSet(OdpPackage.OPAQUE_ELEMENT__KIND, OdpPackage.Literals.OPAQUE_ELEMENT__KIND, newKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getXml() {
		return (String)eDynamicGet(OdpPackage.OPAQUE_ELEMENT__XML, OdpPackage.Literals.OPAQUE_ELEMENT__XML, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setXml(String newXml) {
		eDynamicSet(OdpPackage.OPAQUE_ELEMENT__XML, OdpPackage.Literals.OPAQUE_ELEMENT__XML, newXml);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OdpPackage.OPAQUE_ELEMENT__KIND:
				return getKind();
			case OdpPackage.OPAQUE_ELEMENT__XML:
				return getXml();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OdpPackage.OPAQUE_ELEMENT__KIND:
				setKind((String)newValue);
				return;
			case OdpPackage.OPAQUE_ELEMENT__XML:
				setXml((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OdpPackage.OPAQUE_ELEMENT__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case OdpPackage.OPAQUE_ELEMENT__XML:
				setXml(XML_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OdpPackage.OPAQUE_ELEMENT__KIND:
				return KIND_EDEFAULT == null ? getKind() != null : !KIND_EDEFAULT.equals(getKind());
			case OdpPackage.OPAQUE_ELEMENT__XML:
				return XML_EDEFAULT == null ? getXml() != null : !XML_EDEFAULT.equals(getXml());
		}
		return super.eIsSet(featureID);
	}

} //OpaqueElementImpl
