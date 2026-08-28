/**
 */
package org.nasdanika.models.odp.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.nasdanika.models.odp.OdpPackage;
import org.nasdanika.models.odp.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.odp.impl.StyleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.odp.impl.StyleImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link org.nasdanika.models.odp.impl.StyleImpl#getParentStyleName <em>Parent Style Name</em>}</li>
 *   <li>{@link org.nasdanika.models.odp.impl.StyleImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleImpl extends MinimalEObjectImpl.Container implements Style {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getParentStyleName() <em>Parent Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_STYLE_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OdpPackage.Literals.STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(OdpPackage.STYLE__NAME, OdpPackage.Literals.STYLE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(OdpPackage.STYLE__NAME, OdpPackage.Literals.STYLE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFamily() {
		return (String)eDynamicGet(OdpPackage.STYLE__FAMILY, OdpPackage.Literals.STYLE__FAMILY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFamily(String newFamily) {
		eDynamicSet(OdpPackage.STYLE__FAMILY, OdpPackage.Literals.STYLE__FAMILY, newFamily);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParentStyleName() {
		return (String)eDynamicGet(OdpPackage.STYLE__PARENT_STYLE_NAME, OdpPackage.Literals.STYLE__PARENT_STYLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentStyleName(String newParentStyleName) {
		eDynamicSet(OdpPackage.STYLE__PARENT_STYLE_NAME, OdpPackage.Literals.STYLE__PARENT_STYLE_NAME, newParentStyleName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, String> getProperties() {
		return (EMap<String, String>)eDynamicGet(OdpPackage.STYLE__PROPERTIES, OdpPackage.Literals.STYLE__PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OdpPackage.STYLE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OdpPackage.STYLE__NAME:
				return getName();
			case OdpPackage.STYLE__FAMILY:
				return getFamily();
			case OdpPackage.STYLE__PARENT_STYLE_NAME:
				return getParentStyleName();
			case OdpPackage.STYLE__PROPERTIES:
				if (coreType) return getProperties();
				else return getProperties().map();
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
			case OdpPackage.STYLE__NAME:
				setName((String)newValue);
				return;
			case OdpPackage.STYLE__FAMILY:
				setFamily((String)newValue);
				return;
			case OdpPackage.STYLE__PARENT_STYLE_NAME:
				setParentStyleName((String)newValue);
				return;
			case OdpPackage.STYLE__PROPERTIES:
				((EStructuralFeature.Setting)getProperties()).set(newValue);
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
			case OdpPackage.STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OdpPackage.STYLE__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case OdpPackage.STYLE__PARENT_STYLE_NAME:
				setParentStyleName(PARENT_STYLE_NAME_EDEFAULT);
				return;
			case OdpPackage.STYLE__PROPERTIES:
				getProperties().clear();
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
			case OdpPackage.STYLE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case OdpPackage.STYLE__FAMILY:
				return FAMILY_EDEFAULT == null ? getFamily() != null : !FAMILY_EDEFAULT.equals(getFamily());
			case OdpPackage.STYLE__PARENT_STYLE_NAME:
				return PARENT_STYLE_NAME_EDEFAULT == null ? getParentStyleName() != null : !PARENT_STYLE_NAME_EDEFAULT.equals(getParentStyleName());
			case OdpPackage.STYLE__PROPERTIES:
				return !getProperties().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StyleImpl
