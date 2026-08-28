/**
 */
package org.nasdanika.models.odp.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.odp.OdpPackage;
import org.nasdanika.models.odp.OdpSlide;

import org.nasdanika.models.presentation.impl.SlideImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.odp.impl.OdpSlideImpl#getStyleName <em>Style Name</em>}</li>
 *   <li>{@link org.nasdanika.models.odp.impl.OdpSlideImpl#getPageLayoutName <em>Page Layout Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OdpSlideImpl extends SlideImpl implements OdpSlide {
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
	 * The default value of the '{@link #getPageLayoutName() <em>Page Layout Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageLayoutName()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_LAYOUT_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OdpSlideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OdpPackage.Literals.ODP_SLIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStyleName() {
		return (String)eDynamicGet(OdpPackage.ODP_SLIDE__STYLE_NAME, OdpPackage.Literals.ODP_SLIDE__STYLE_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyleName(String newStyleName) {
		eDynamicSet(OdpPackage.ODP_SLIDE__STYLE_NAME, OdpPackage.Literals.ODP_SLIDE__STYLE_NAME, newStyleName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPageLayoutName() {
		return (String)eDynamicGet(OdpPackage.ODP_SLIDE__PAGE_LAYOUT_NAME, OdpPackage.Literals.ODP_SLIDE__PAGE_LAYOUT_NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageLayoutName(String newPageLayoutName) {
		eDynamicSet(OdpPackage.ODP_SLIDE__PAGE_LAYOUT_NAME, OdpPackage.Literals.ODP_SLIDE__PAGE_LAYOUT_NAME, newPageLayoutName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OdpPackage.ODP_SLIDE__STYLE_NAME:
				return getStyleName();
			case OdpPackage.ODP_SLIDE__PAGE_LAYOUT_NAME:
				return getPageLayoutName();
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
			case OdpPackage.ODP_SLIDE__STYLE_NAME:
				setStyleName((String)newValue);
				return;
			case OdpPackage.ODP_SLIDE__PAGE_LAYOUT_NAME:
				setPageLayoutName((String)newValue);
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
			case OdpPackage.ODP_SLIDE__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
				return;
			case OdpPackage.ODP_SLIDE__PAGE_LAYOUT_NAME:
				setPageLayoutName(PAGE_LAYOUT_NAME_EDEFAULT);
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
			case OdpPackage.ODP_SLIDE__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? getStyleName() != null : !STYLE_NAME_EDEFAULT.equals(getStyleName());
			case OdpPackage.ODP_SLIDE__PAGE_LAYOUT_NAME:
				return PAGE_LAYOUT_NAME_EDEFAULT == null ? getPageLayoutName() != null : !PAGE_LAYOUT_NAME_EDEFAULT.equals(getPageLayoutName());
		}
		return super.eIsSet(featureID);
	}

} //OdpSlideImpl
