/**
 */
package org.nasdanika.models.odp.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.odp.OdpPackage;
import org.nasdanika.models.odp.OdpShape;

import org.nasdanika.models.presentation.impl.ShapeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.odp.impl.OdpShapeImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.nasdanika.models.odp.impl.OdpShapeImpl#getPresentationClass <em>Presentation Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OdpShapeImpl extends ShapeImpl implements OdpShape {
	/**
	 * The default value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPresentationClass() <em>Presentation Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PRESENTATION_CLASS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OdpShapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OdpPackage.Literals.ODP_SHAPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleName() {
		return (String)eDynamicGet(OdpPackage.ODP_SHAPE__STYLE_NAME, OdpPackage.Literals.ODP_SHAPE__STYLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleName(String newStyleName) {
		eDynamicSet(OdpPackage.ODP_SHAPE__STYLE_NAME, OdpPackage.Literals.ODP_SHAPE__STYLE_NAME, newStyleName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPresentationClass() {
		return (String)eDynamicGet(OdpPackage.ODP_SHAPE__PRESENTATION_CLASS, OdpPackage.Literals.ODP_SHAPE__PRESENTATION_CLASS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPresentationClass(String newPresentationClass) {
		eDynamicSet(OdpPackage.ODP_SHAPE__PRESENTATION_CLASS, OdpPackage.Literals.ODP_SHAPE__PRESENTATION_CLASS, newPresentationClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OdpPackage.ODP_SHAPE__STYLE_NAME:
				return getStyleName();
			case OdpPackage.ODP_SHAPE__PRESENTATION_CLASS:
				return getPresentationClass();
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
			case OdpPackage.ODP_SHAPE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case OdpPackage.ODP_SHAPE__PRESENTATION_CLASS:
				setPresentationClass((String)newValue);
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
			case OdpPackage.ODP_SHAPE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case OdpPackage.ODP_SHAPE__PRESENTATION_CLASS:
				setPresentationClass(PRESENTATION_CLASS_EDEFAULT);
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
			case OdpPackage.ODP_SHAPE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? getStyleName() != null : !STYLE_NAME_EDEFAULT.equals(getStyleName());
			case OdpPackage.ODP_SHAPE__PRESENTATION_CLASS:
				return PRESENTATION_CLASS_EDEFAULT == null ? getPresentationClass() != null : !PRESENTATION_CLASS_EDEFAULT.equals(getPresentationClass());
		}
		return super.eIsSet(featureID);
	}

} //OdpShapeImpl
