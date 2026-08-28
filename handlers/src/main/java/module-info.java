import org.nasdanika.capability.CapabilityFactory;
import org.nasdanika.models.odp.handlers.OdpToEcoreArrayResourceContentsHandlerCapabilityFactory;
import org.nasdanika.models.odp.handlers.OdpToEcoreResourceContentsHandlerCapabilityFactory;

module org.nasdanika.models.odp.handlers {
	
	exports org.nasdanika.models.odp.handlers;
	opens org.nasdanika.models.odp.handlers to org.nasdanika.common; // For transformer
		
	requires transitive org.nasdanika.models.odp;
	requires org.apache.commons.lang3;
	requires org.eclipse.emf.ecore;
	
	provides CapabilityFactory with 
		OdpToEcoreArrayResourceContentsHandlerCapabilityFactory,
		OdpToEcoreResourceContentsHandlerCapabilityFactory;
	
}