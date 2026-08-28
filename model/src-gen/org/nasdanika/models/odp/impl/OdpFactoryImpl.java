/**
 */
package org.nasdanika.models.odp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.models.odp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OdpFactoryImpl extends EFactoryImpl implements OdpFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OdpFactory init() {
		try {
			OdpFactory theOdpFactory = (OdpFactory)EPackage.Registry.INSTANCE.getEFactory(OdpPackage.eNS_URI);
			if (theOdpFactory != null) {
				return theOdpFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OdpFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OdpFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OdpPackage.ODP_PRESENTATION: return createOdpPresentation();
			case OdpPackage.ODP_SLIDE: return createOdpSlide();
			case OdpPackage.STYLE: return createStyle();
			case OdpPackage.ODP_SHAPE: return createOdpShape();
			case OdpPackage.OPAQUE_ELEMENT: return createOpaqueElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OdpPresentation createOdpPresentation() {
		OdpPresentationImpl odpPresentation = new OdpPresentationImpl();
		return odpPresentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OdpSlide createOdpSlide() {
		OdpSlideImpl odpSlide = new OdpSlideImpl();
		return odpSlide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Style createStyle() {
		StyleImpl style = new StyleImpl();
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OdpShape createOdpShape() {
		OdpShapeImpl odpShape = new OdpShapeImpl();
		return odpShape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpaqueElement createOpaqueElement() {
		OpaqueElementImpl opaqueElement = new OpaqueElementImpl();
		return opaqueElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OdpPackage getOdpPackage() {
		return (OdpPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OdpPackage getPackage() {
		return OdpPackage.eINSTANCE;
	}

} //OdpFactoryImpl
