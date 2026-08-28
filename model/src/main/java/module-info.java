import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.odp.capability.OdpArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.odp.capability.OdpEPackageResourceSetCapabilityFactory;
import org.nasdanika.models.odp.capability.OdpResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.odp.capability.OdpResourceFactoryCapabilityFactory;

module org.nasdanika.models.odp {
	
	exports org.nasdanika.models.odp;
	exports org.nasdanika.models.odp.impl;
	exports org.nasdanika.models.odp.util;
	exports org.nasdanika.models.odp.loader;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive org.nasdanika.models.presentation;
	
	provides CapabilityFactory with 
		OdpEPackageResourceSetCapabilityFactory,
		OdpResourceFactoryCapabilityFactory,
		OdpResourceContentsHandlerCapabilityFactory,
		OdpArrayResourceContentsHandlerCapabilityFactory;
	
}