/**
 */
package org.nasdanika.models.odp.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.models.diagram.DiagramPackage;

import org.nasdanika.models.nxcore.NxcorePackage;

import org.nasdanika.models.odp.OdpFactory;
import org.nasdanika.models.odp.OdpPackage;
import org.nasdanika.models.odp.OdpPresentation;
import org.nasdanika.models.odp.OdpShape;
import org.nasdanika.models.odp.OdpSlide;
import org.nasdanika.models.odp.OpaqueElement;
import org.nasdanika.models.odp.Style;

import org.nasdanika.models.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OdpPackageImpl extends EPackageImpl implements OdpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odpPresentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odpSlideEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass odpShapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.odp.OdpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OdpPackageImpl() {
		super(eNS_URI, OdpFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link OdpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OdpPackage init() {
		if (isInited) return (OdpPackage)EPackage.Registry.INSTANCE.getEPackage(OdpPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOdpPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OdpPackageImpl theOdpPackage = registeredOdpPackage instanceof OdpPackageImpl ? (OdpPackageImpl)registeredOdpPackage : new OdpPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		PresentationPackage.eINSTANCE.eClass();
		NxcorePackage.eINSTANCE.eClass();
		DiagramPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOdpPackage.createPackageContents();

		// Initialize created meta-data
		theOdpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOdpPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OdpPackage.eNS_URI, theOdpPackage);
		return theOdpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOdpPresentation() {
		return odpPresentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOdpPresentation_Styles() {
		return (EReference)odpPresentationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOdpSlide() {
		return odpSlideEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOdpSlide_StyleName() {
		return (EAttribute)odpSlideEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOdpSlide_PageLayoutName() {
		return (EAttribute)odpSlideEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStyle() {
		return styleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyle_Name() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyle_Family() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyle_ParentStyleName() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStyle_Properties() {
		return (EReference)styleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOdpShape() {
		return odpShapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOdpShape_StyleName() {
		return (EAttribute)odpShapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOdpShape_PresentationClass() {
		return (EAttribute)odpShapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOpaqueElement() {
		return opaqueElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpaqueElement_Kind() {
		return (EAttribute)opaqueElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOpaqueElement_Xml() {
		return (EAttribute)opaqueElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OdpFactory getOdpFactory() {
		return (OdpFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		odpPresentationEClass = createEClass(ODP_PRESENTATION);
		createEReference(odpPresentationEClass, ODP_PRESENTATION__STYLES);

		odpSlideEClass = createEClass(ODP_SLIDE);
		createEAttribute(odpSlideEClass, ODP_SLIDE__STYLE_NAME);
		createEAttribute(odpSlideEClass, ODP_SLIDE__PAGE_LAYOUT_NAME);

		styleEClass = createEClass(STYLE);
		createEAttribute(styleEClass, STYLE__NAME);
		createEAttribute(styleEClass, STYLE__FAMILY);
		createEAttribute(styleEClass, STYLE__PARENT_STYLE_NAME);
		createEReference(styleEClass, STYLE__PROPERTIES);

		odpShapeEClass = createEClass(ODP_SHAPE);
		createEAttribute(odpShapeEClass, ODP_SHAPE__STYLE_NAME);
		createEAttribute(odpShapeEClass, ODP_SHAPE__PRESENTATION_CLASS);

		opaqueElementEClass = createEClass(OPAQUE_ELEMENT);
		createEAttribute(opaqueElementEClass, OPAQUE_ELEMENT__KIND);
		createEAttribute(opaqueElementEClass, OPAQUE_ELEMENT__XML);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PresentationPackage thePresentationPackage = (PresentationPackage)EPackage.Registry.INSTANCE.getEPackage(PresentationPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		NxcorePackage theNxcorePackage = (NxcorePackage)EPackage.Registry.INSTANCE.getEPackage(NxcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		odpPresentationEClass.getESuperTypes().add(thePresentationPackage.getPresentation());
		odpSlideEClass.getESuperTypes().add(thePresentationPackage.getSlide());
		odpShapeEClass.getESuperTypes().add(thePresentationPackage.getShape());
		opaqueElementEClass.getESuperTypes().add(thePresentationPackage.getShape());

		// Initialize classes, features, and operations; add parameters
		initEClass(odpPresentationEClass, OdpPresentation.class, "OdpPresentation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOdpPresentation_Styles(), this.getStyle(), null, "styles", null, 0, -1, OdpPresentation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odpSlideEClass, OdpSlide.class, "OdpSlide", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOdpSlide_StyleName(), theEcorePackage.getEString(), "styleName", null, 0, 1, OdpSlide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOdpSlide_PageLayoutName(), theEcorePackage.getEString(), "pageLayoutName", null, 0, 1, OdpSlide.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyle_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_Family(), theEcorePackage.getEString(), "family", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_ParentStyleName(), theEcorePackage.getEString(), "parentStyleName", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyle_Properties(), theNxcorePackage.getStringToStringMapEntry(), null, "properties", null, 0, -1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(odpShapeEClass, OdpShape.class, "OdpShape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOdpShape_StyleName(), theEcorePackage.getEString(), "styleName", null, 0, 1, OdpShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOdpShape_PresentationClass(), theEcorePackage.getEString(), "presentationClass", null, 0, 1, OdpShape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(opaqueElementEClass, OpaqueElement.class, "OpaqueElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueElement_Kind(), theEcorePackage.getEString(), "kind", null, 0, 1, OpaqueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpaqueElement_Xml(), theEcorePackage.getEString(), "xml", null, 0, 1, OpaqueElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "featureDelegation", "Dynamic",
			   "complianceLevel", "21.0",
			   "suppressGenModelAnnotations", "false",
			   "copyrightFields", "false",
			   "operationReflection", "true",
			   "importOrganizing", "true",
			   "basePackage", "org.nasdanika.models"
		   });
		addAnnotation
		  (odpSlideEClass,
		   source,
		   new String[] {
			   "documentation", " draw:page"
		   });
		addAnnotation
		  (getOdpSlide_StyleName(),
		   source,
		   new String[] {
			   "documentation", " draw:style-name"
		   });
		addAnnotation
		  (getOdpSlide_PageLayoutName(),
		   source,
		   new String[] {
			   "documentation", " presentation:presentation-page-layout-name"
		   });
		addAnnotation
		  (styleEClass,
		   source,
		   new String[] {
			   "documentation", "ODF automatic/common style \ufffd flattened name/family + properties map,\nnot the full ODF style model."
		   });
		addAnnotation
		  (getStyle_Family(),
		   source,
		   new String[] {
			   "documentation", " graphic | paragraph | text | presentation | drawing-page"
		   });
		addAnnotation
		  (odpShapeEClass,
		   source,
		   new String[] {
			   "documentation", " Shape with an ODF style reference."
		   });
		addAnnotation
		  (getOdpShape_PresentationClass(),
		   source,
		   new String[] {
			   "documentation", " presentation:class for placeholder frames: title | outline | subtitle | notes | ..."
		   });
		addAnnotation
		  (opaqueElementEClass,
		   source,
		   new String[] {
			   "documentation", " Preserved-but-not-modeled elements (charts, OLE, custom draw elements)."
		   });
		addAnnotation
		  (getOpaqueElement_Xml(),
		   source,
		   new String[] {
			   "documentation", " Serialized XML of the source element for lossless save."
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "Ecore", "http://www.eclipse.org/emf/2002/Ecore",
			   "GenModel", "http://www.eclipse.org/emf/2002/GenModel",
			   "Nasdanika", "urn:org.nasdanika"
		   });
	}

} //OdpPackageImpl
