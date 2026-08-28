/**
 */
package org.nasdanika.models.odp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.nasdanika.models.presentation.PresentationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.odp.OdpFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel featureDelegation='Dynamic' complianceLevel='21.0' suppressGenModelAnnotations='false' copyrightFields='false' operationReflection='true' importOrganizing='true' basePackage='org.nasdanika.models'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore Ecore='http://www.eclipse.org/emf/2002/Ecore' GenModel='http://www.eclipse.org/emf/2002/GenModel' Nasdanika='urn:org.nasdanika'"
 * @generated
 */
public interface OdpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "odp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://odp.models.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.odp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OdpPackage eINSTANCE = org.nasdanika.models.odp.impl.OdpPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.odp.impl.OdpPresentationImpl <em>Presentation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.odp.impl.OdpPresentationImpl
	 * @see org.nasdanika.models.odp.impl.OdpPackageImpl#getOdpPresentation()
	 * @generated
	 */
	int ODP_PRESENTATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__ID = PresentationPackage.PRESENTATION__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__DOCUMENTATION = PresentationPackage.PRESENTATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__DOC_REF = PresentationPackage.PRESENTATION__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__DOC_FORMAT = PresentationPackage.PRESENTATION__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__DOC_CONTENTS = PresentationPackage.PRESENTATION__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__DOC_SECTIONS = PresentationPackage.PRESENTATION__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__MARKERS = PresentationPackage.PRESENTATION__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__ICON = PresentationPackage.PRESENTATION__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__URIS = PresentationPackage.PRESENTATION__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__NAME = PresentationPackage.PRESENTATION__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__TAGS = PresentationPackage.PRESENTATION__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__PROPERTIES = PresentationPackage.PRESENTATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__SEMANTIC_ELEMENTS = PresentationPackage.PRESENTATION__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__CHILDREN = PresentationPackage.PRESENTATION__CHILDREN;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__WIDTH = PresentationPackage.PRESENTATION__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__HEIGHT = PresentationPackage.PRESENTATION__HEIGHT;

	/**
	 * The feature id for the '<em><b>Slides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__SLIDES = PresentationPackage.PRESENTATION__SLIDES;

	/**
	 * The feature id for the '<em><b>Master Slides</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__MASTER_SLIDES = PresentationPackage.PRESENTATION__MASTER_SLIDES;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION__STYLES = PresentationPackage.PRESENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION_FEATURE_COUNT = PresentationPackage.PRESENTATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION___COLLECT__OBJECT_EREFERENCE_ELIST = PresentationPackage.PRESENTATION___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION___GET_REFERRERS__EREFERENCE = PresentationPackage.PRESENTATION___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Presentation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_PRESENTATION_OPERATION_COUNT = PresentationPackage.PRESENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.odp.impl.OdpSlideImpl <em>Slide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.odp.impl.OdpSlideImpl
	 * @see org.nasdanika.models.odp.impl.OdpPackageImpl#getOdpSlide()
	 * @generated
	 */
	int ODP_SLIDE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__ID = PresentationPackage.SLIDE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__DOCUMENTATION = PresentationPackage.SLIDE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__DOC_REF = PresentationPackage.SLIDE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__DOC_FORMAT = PresentationPackage.SLIDE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__DOC_CONTENTS = PresentationPackage.SLIDE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__DOC_SECTIONS = PresentationPackage.SLIDE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__MARKERS = PresentationPackage.SLIDE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__ICON = PresentationPackage.SLIDE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__URIS = PresentationPackage.SLIDE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__NAME = PresentationPackage.SLIDE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__TAGS = PresentationPackage.SLIDE__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__PROPERTIES = PresentationPackage.SLIDE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__SEMANTIC_ELEMENTS = PresentationPackage.SLIDE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__CHILDREN = PresentationPackage.SLIDE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Master</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__MASTER = PresentationPackage.SLIDE__MASTER;

	/**
	 * The feature id for the '<em><b>Hidden</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__HIDDEN = PresentationPackage.SLIDE__HIDDEN;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__NOTES = PresentationPackage.SLIDE__NOTES;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__STYLE_NAME = PresentationPackage.SLIDE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page Layout Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE__PAGE_LAYOUT_NAME = PresentationPackage.SLIDE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Slide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE_FEATURE_COUNT = PresentationPackage.SLIDE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE___COLLECT__OBJECT_EREFERENCE_ELIST = PresentationPackage.SLIDE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE___GET_REFERRERS__EREFERENCE = PresentationPackage.SLIDE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Slide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SLIDE_OPERATION_COUNT = PresentationPackage.SLIDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.odp.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.odp.impl.StyleImpl
	 * @see org.nasdanika.models.odp.impl.OdpPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__FAMILY = 1;

	/**
	 * The feature id for the '<em><b>Parent Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__PARENT_STYLE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__PROPERTIES = 3;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.odp.impl.OdpShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.odp.impl.OdpShapeImpl
	 * @see org.nasdanika.models.odp.impl.OdpPackageImpl#getOdpShape()
	 * @generated
	 */
	int ODP_SHAPE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__ID = PresentationPackage.SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__DOCUMENTATION = PresentationPackage.SHAPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__DOC_REF = PresentationPackage.SHAPE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__DOC_FORMAT = PresentationPackage.SHAPE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__DOC_CONTENTS = PresentationPackage.SHAPE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__DOC_SECTIONS = PresentationPackage.SHAPE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__MARKERS = PresentationPackage.SHAPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__ICON = PresentationPackage.SHAPE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__URIS = PresentationPackage.SHAPE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__NAME = PresentationPackage.SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__TAGS = PresentationPackage.SHAPE__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__PROPERTIES = PresentationPackage.SHAPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__SEMANTIC_ELEMENTS = PresentationPackage.SHAPE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__CHILDREN = PresentationPackage.SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__INCOMING_CONNECTIONS = PresentationPackage.SHAPE__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__OUTGOING_CONNECTIONS = PresentationPackage.SHAPE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__BOUNDS = PresentationPackage.SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__PORTS = PresentationPackage.SHAPE__PORTS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__ORDER = PresentationPackage.SHAPE__ORDER;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__ROTATION = PresentationPackage.SHAPE__ROTATION;

	/**
	 * The feature id for the '<em><b>Flip Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__FLIP_HORIZONTAL = PresentationPackage.SHAPE__FLIP_HORIZONTAL;

	/**
	 * The feature id for the '<em><b>Flip Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__FLIP_VERTICAL = PresentationPackage.SHAPE__FLIP_VERTICAL;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__STYLE_NAME = PresentationPackage.SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Presentation Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE__PRESENTATION_CLASS = PresentationPackage.SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE_FEATURE_COUNT = PresentationPackage.SHAPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST = PresentationPackage.SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE___GET_REFERRERS__EREFERENCE = PresentationPackage.SHAPE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ODP_SHAPE_OPERATION_COUNT = PresentationPackage.SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.odp.impl.OpaqueElementImpl <em>Opaque Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.odp.impl.OpaqueElementImpl
	 * @see org.nasdanika.models.odp.impl.OdpPackageImpl#getOpaqueElement()
	 * @generated
	 */
	int OPAQUE_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__ID = PresentationPackage.SHAPE__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__DOCUMENTATION = PresentationPackage.SHAPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Doc Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__DOC_REF = PresentationPackage.SHAPE__DOC_REF;

	/**
	 * The feature id for the '<em><b>Doc Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__DOC_FORMAT = PresentationPackage.SHAPE__DOC_FORMAT;

	/**
	 * The feature id for the '<em><b>Doc Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__DOC_CONTENTS = PresentationPackage.SHAPE__DOC_CONTENTS;

	/**
	 * The feature id for the '<em><b>Doc Sections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__DOC_SECTIONS = PresentationPackage.SHAPE__DOC_SECTIONS;

	/**
	 * The feature id for the '<em><b>Markers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__MARKERS = PresentationPackage.SHAPE__MARKERS;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__ICON = PresentationPackage.SHAPE__ICON;

	/**
	 * The feature id for the '<em><b>Uris</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__URIS = PresentationPackage.SHAPE__URIS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__NAME = PresentationPackage.SHAPE__NAME;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__TAGS = PresentationPackage.SHAPE__TAGS;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__PROPERTIES = PresentationPackage.SHAPE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Semantic Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__SEMANTIC_ELEMENTS = PresentationPackage.SHAPE__SEMANTIC_ELEMENTS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__CHILDREN = PresentationPackage.SHAPE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__INCOMING_CONNECTIONS = PresentationPackage.SHAPE__INCOMING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__OUTGOING_CONNECTIONS = PresentationPackage.SHAPE__OUTGOING_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__BOUNDS = PresentationPackage.SHAPE__BOUNDS;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__PORTS = PresentationPackage.SHAPE__PORTS;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__ORDER = PresentationPackage.SHAPE__ORDER;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__ROTATION = PresentationPackage.SHAPE__ROTATION;

	/**
	 * The feature id for the '<em><b>Flip Horizontal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__FLIP_HORIZONTAL = PresentationPackage.SHAPE__FLIP_HORIZONTAL;

	/**
	 * The feature id for the '<em><b>Flip Vertical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__FLIP_VERTICAL = PresentationPackage.SHAPE__FLIP_VERTICAL;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__KIND = PresentationPackage.SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT__XML = PresentationPackage.SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Opaque Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT_FEATURE_COUNT = PresentationPackage.SHAPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Collect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT___COLLECT__OBJECT_EREFERENCE_ELIST = PresentationPackage.SHAPE___COLLECT__OBJECT_EREFERENCE_ELIST;

	/**
	 * The operation id for the '<em>Get Referrers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT___GET_REFERRERS__EREFERENCE = PresentationPackage.SHAPE___GET_REFERRERS__EREFERENCE;

	/**
	 * The number of operations of the '<em>Opaque Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPAQUE_ELEMENT_OPERATION_COUNT = PresentationPackage.SHAPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.odp.OdpPresentation <em>Presentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Presentation</em>'.
	 * @see org.nasdanika.models.odp.OdpPresentation
	 * @generated
	 */
	EClass getOdpPresentation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.odp.OdpPresentation#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styles</em>'.
	 * @see org.nasdanika.models.odp.OdpPresentation#getStyles()
	 * @see #getOdpPresentation()
	 * @generated
	 */
	EReference getOdpPresentation_Styles();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.odp.OdpSlide <em>Slide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slide</em>'.
	 * @see org.nasdanika.models.odp.OdpSlide
	 * @generated
	 */
	EClass getOdpSlide();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.odp.OdpSlide#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.nasdanika.models.odp.OdpSlide#getStyleName()
	 * @see #getOdpSlide()
	 * @generated
	 */
	EAttribute getOdpSlide_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.odp.OdpSlide#getPageLayoutName <em>Page Layout Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Layout Name</em>'.
	 * @see org.nasdanika.models.odp.OdpSlide#getPageLayoutName()
	 * @see #getOdpSlide()
	 * @generated
	 */
	EAttribute getOdpSlide_PageLayoutName();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.odp.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see org.nasdanika.models.odp.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.odp.Style#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.odp.Style#getName()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.odp.Style#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see org.nasdanika.models.odp.Style#getFamily()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Family();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.odp.Style#getParentStyleName <em>Parent Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parent Style Name</em>'.
	 * @see org.nasdanika.models.odp.Style#getParentStyleName()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_ParentStyleName();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.odp.Style#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Properties</em>'.
	 * @see org.nasdanika.models.odp.Style#getProperties()
	 * @see #getStyle()
	 * @generated
	 */
	EReference getStyle_Properties();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.odp.OdpShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.nasdanika.models.odp.OdpShape
	 * @generated
	 */
	EClass getOdpShape();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.odp.OdpShape#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see org.nasdanika.models.odp.OdpShape#getStyleName()
	 * @see #getOdpShape()
	 * @generated
	 */
	EAttribute getOdpShape_StyleName();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.odp.OdpShape#getPresentationClass <em>Presentation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Presentation Class</em>'.
	 * @see org.nasdanika.models.odp.OdpShape#getPresentationClass()
	 * @see #getOdpShape()
	 * @generated
	 */
	EAttribute getOdpShape_PresentationClass();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.odp.OpaqueElement <em>Opaque Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Opaque Element</em>'.
	 * @see org.nasdanika.models.odp.OpaqueElement
	 * @generated
	 */
	EClass getOpaqueElement();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.odp.OpaqueElement#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.nasdanika.models.odp.OpaqueElement#getKind()
	 * @see #getOpaqueElement()
	 * @generated
	 */
	EAttribute getOpaqueElement_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.odp.OpaqueElement#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml</em>'.
	 * @see org.nasdanika.models.odp.OpaqueElement#getXml()
	 * @see #getOpaqueElement()
	 * @generated
	 */
	EAttribute getOpaqueElement_Xml();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OdpFactory getOdpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.odp.impl.OdpPresentationImpl <em>Presentation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.odp.impl.OdpPresentationImpl
		 * @see org.nasdanika.models.odp.impl.OdpPackageImpl#getOdpPresentation()
		 * @generated
		 */
		EClass ODP_PRESENTATION = eINSTANCE.getOdpPresentation();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ODP_PRESENTATION__STYLES = eINSTANCE.getOdpPresentation_Styles();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.odp.impl.OdpSlideImpl <em>Slide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.odp.impl.OdpSlideImpl
		 * @see org.nasdanika.models.odp.impl.OdpPackageImpl#getOdpSlide()
		 * @generated
		 */
		EClass ODP_SLIDE = eINSTANCE.getOdpSlide();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ODP_SLIDE__STYLE_NAME = eINSTANCE.getOdpSlide_StyleName();

		/**
		 * The meta object literal for the '<em><b>Page Layout Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ODP_SLIDE__PAGE_LAYOUT_NAME = eINSTANCE.getOdpSlide_PageLayoutName();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.odp.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.odp.impl.StyleImpl
		 * @see org.nasdanika.models.odp.impl.OdpPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__NAME = eINSTANCE.getStyle_Name();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__FAMILY = eINSTANCE.getStyle_Family();

		/**
		 * The meta object literal for the '<em><b>Parent Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__PARENT_STYLE_NAME = eINSTANCE.getStyle_ParentStyleName();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE__PROPERTIES = eINSTANCE.getStyle_Properties();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.odp.impl.OdpShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.odp.impl.OdpShapeImpl
		 * @see org.nasdanika.models.odp.impl.OdpPackageImpl#getOdpShape()
		 * @generated
		 */
		EClass ODP_SHAPE = eINSTANCE.getOdpShape();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ODP_SHAPE__STYLE_NAME = eINSTANCE.getOdpShape_StyleName();

		/**
		 * The meta object literal for the '<em><b>Presentation Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ODP_SHAPE__PRESENTATION_CLASS = eINSTANCE.getOdpShape_PresentationClass();

		/**
		 * The meta object literal for the '{@link org.nasdanika.models.odp.impl.OpaqueElementImpl <em>Opaque Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.odp.impl.OpaqueElementImpl
		 * @see org.nasdanika.models.odp.impl.OdpPackageImpl#getOpaqueElement()
		 * @generated
		 */
		EClass OPAQUE_ELEMENT = eINSTANCE.getOpaqueElement();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_ELEMENT__KIND = eINSTANCE.getOpaqueElement_Kind();

		/**
		 * The meta object literal for the '<em><b>Xml</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPAQUE_ELEMENT__XML = eINSTANCE.getOpaqueElement_Xml();

	}

} //OdpPackage
