package org.dcc.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Product
 * 
 * 注:每一个产品 有两个category
 */

public class Product implements java.io.Serializable {

	// Fields

	private Long puid;
	private FunctionalType functionalType;//
	private Category category; // CFG
	private Brand brand;//
	private Mfg mfg;
	private String description;
	private String mt;
	private String model;
	private String featCode;
	private String ppn;
	private String fruPn;
	private String optPn;
	private String mfgPn;
	private String sbb;
	private String mfi;// MFI
	private String ffi;// FFI
	private String price;
	private String modelx;
	private Character visible;
	private String fcAas;
	private Character passthru;
	private Character xccVld;
	private String bhcId;
	private String bhcFeat;
	private String customerSelected;
	private String priced;
	private String poptPn;
	/* Releases */
	private Set relProds = new HashSet(0);
	private Set releases = new HashSet(0);

	private Set addHists = new HashSet(0);
	private Set opsysesForProcFc = new HashSet(0);
	private Set prodP2pLocations = new HashSet(0);
	private Set servpacs = new HashSet(0);
	private Set requiredAddsesForReqAdd = new HashSet(0);
	private Set rackings = new HashSet(0);
	private Set fillerses = new HashSet(0);
	private Set fcAllautos = new HashSet(0);
	private Set defaultAddsesForProduct = new HashSet(0);
	private Set requiredAddsesForProd2 = new HashSet(0);
	private Set gavMapsForOpt = new HashSet(0);
	private Set ndpses = new HashSet(0);
	private Set overideDatesesForSbbPuid = new HashSet(0);
	private Set xccHvecsForHvec = new HashSet(0);
	private Set opsysesForLicense = new HashSet(0);
	private Set usrComts = new HashSet(0);
	private Set solutionCatsForSolSbFc = new HashSet(0);
	private Set prdLocks = new HashSet(0);
	private Set pduMapsForHvecCbl = new HashSet(0);
	private Set networkHcas = new HashSet(0);
	private Set procMaps = new HashSet(0);
	private Set fcAutoaddsForFcAdd = new HashSet(0);
	private Set networkSwitchs = new HashSet(0);
	private Set placementMaps = new HashSet(0);
	private Set connLayoutMaps = new HashSet(0);
	private Set conditionalAddsesForSourceBPuid = new HashSet(0);

	private Set conditionalAddsesForSourceDPuid = new HashSet(0);
	private Set connectorReplcmnts = new HashSet(0);
	private Set pwrMaps = new HashSet(0);
	private Set softwareRoutings = new HashSet(0);
	private Set gavMapsForXccMt = new HashSet(0);
	private Set ecs = new HashSet(0);
	private Set conditionalAddsesForSourceCPuid = new HashSet(0);
	private Set defaultAddsesForDfltAdd = new HashSet(0);
	private Set pduMapsForXccPdu = new HashSet(0);
	private Set opsysesForServer = new HashSet(0);
	private Set masterCompatMapsForCompPuid = new HashSet(0);
	private Set opsysSelectsForFeature = new HashSet(0);
	private Set conditionalAddsesForSourceAPuid = new HashSet(0);
	private Set prodShortLbls = new HashSet(0);
	private Set incompatsForPuid2 = new HashSet(0);
	private Set gavMapsForHvecMtm = new HashSet(0);
	private Set memMapsForXccMem = new HashSet(0);
	private Set subComponentsesForSubCompPuid = new HashSet(0);
	private Set prdFcs = new HashSet(0);
	private Set salesItemses = new HashSet(0);
	private Set incompatsForPuid1 = new HashSet(0);
	private Set subComponentsesForCompPuid = new HashSet(0);
	private Set replaceProductsForPuid = new HashSet(0);
	private Set prodPics = new HashSet(0);
	private Set replaceProductsForReplacementPuid = new HashSet(0);
	private Set PDateses = new HashSet(0);
	private Set opsysesForOsFc = new HashSet(0);
	private Set supAddsesForProd1 = new HashSet(0);
	private Set masterCompatMapsForMtPuid = new HashSet(0);
	private Set supAddsesForSupAdd = new HashSet(0);
	private Set requiredAddsesForProd1 = new HashSet(0);
	private Set supAddsesForProd2 = new HashSet(0);
	private Set productGroups = new HashSet(0);
	private Set olbBoxerIncomps = new HashSet(0);
	private Set xccPricesForMt = new HashSet(0);
	private Set opsysSelectsForMedKit = new HashSet(0);
	private Set conditionalAddsesForResultPuid = new HashSet(0);
	private Set opsysSelectsForSftwrPid = new HashSet(0);
	private Set slotMisForOpt = new HashSet(0);
	private Set rackLimitsForProduct = new HashSet(0);
	private Set fcAutoaddsForFcTool = new HashSet(0);
	private Set conditionalAddsesForDestinationPuid = new HashSet(0);
	private Set slotMisForMt = new HashSet(0);
	private Set networkCables = new HashSet(0);
	private Set opsysesForSupFc = new HashSet(0);
	private Set procAddonMapsForProcAddonPuid = new HashSet(0);
	private Set procAddonMapsForProcInitPuid = new HashSet(0);
	private Set rackLimitsForRack = new HashSet(0);
	private Set solutionCatsForSolFc = new HashSet(0);
	private Set puidCtryComps = new HashSet(0);
	private Set cogRacks = new HashSet(0);
	private Set chgHists = new HashSet(0);
	private Set categoryProdGrps = new HashSet(0);
	private Set overideDatesesForMtPuid = new HashSet(0);
	private Set memMapsForHvecMem = new HashSet(0);
	private Set xccHvecsForXcc = new HashSet(0);
	private Set relChngs = new HashSet(0);
	private Set oemDatas = new HashSet(0);
	private Set xccPricesForFeat = new HashSet(0);
	private Set pduMapsForHvecPdu = new HashSet(0);
	private Set servpacTrgtsyses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(Long puid, String description, String priced) {
		this.puid = puid;
		this.description = description;
		this.priced = priced;
	}

	// Property accessors

	public Product(Long puid, FunctionalType functionalType, Category category, Brand brand, Mfg mfg,
			String description, String mt, String model, String featCode, String ppn, String fruPn, String optPn,
			String mfgPn, String sbb, String mfi, String ffi, String price, String modelx, Character visible,
			String fcAas, Character passthru, Character xccVld, String bhcId, String bhcFeat, String customerSelected,
			String priced, String poptPn, Set addHists, Set opsysesForProcFc, Set prodP2pLocations, Set servpacs,
			Set requiredAddsesForReqAdd, Set rackings, Set fillerses, Set fcAllautos, Set defaultAddsesForProduct,
			Set requiredAddsesForProd2, Set gavMapsForOpt, Set ndpses, Set overideDatesesForSbbPuid,
			Set xccHvecsForHvec, Set opsysesForLicense, Set usrComts, Set solutionCatsForSolSbFc, Set prdLocks,
			Set pduMapsForHvecCbl, Set networkHcas, Set procMaps, Set fcAutoaddsForFcAdd, Set networkSwitchs,
			Set placementMaps, Set connLayoutMaps, Set conditionalAddsesForSourceBPuid, Set relProds,
			Set conditionalAddsesForSourceDPuid, Set connectorReplcmnts, Set pwrMaps, Set softwareRoutings,
			Set gavMapsForXccMt, Set ecs, Set conditionalAddsesForSourceCPuid, Set defaultAddsesForDfltAdd,
			Set pduMapsForXccPdu, Set opsysesForServer, Set masterCompatMapsForCompPuid, Set opsysSelectsForFeature,
			Set conditionalAddsesForSourceAPuid, Set prodShortLbls, Set incompatsForPuid2, Set gavMapsForHvecMtm,
			Set memMapsForXccMem, Set subComponentsesForSubCompPuid, Set prdFcs, Set salesItemses,
			Set incompatsForPuid1, Set subComponentsesForCompPuid, Set replaceProductsForPuid, Set prodPics,
			Set replaceProductsForReplacementPuid, Set pDateses, Set opsysesForOsFc, Set supAddsesForProd1,
			Set masterCompatMapsForMtPuid, Set supAddsesForSupAdd, Set requiredAddsesForProd1, Set supAddsesForProd2,
			Set productGroups, Set olbBoxerIncomps, Set xccPricesForMt, Set opsysSelectsForMedKit,
			Set conditionalAddsesForResultPuid, Set opsysSelectsForSftwrPid, Set slotMisForOpt,
			Set rackLimitsForProduct, Set fcAutoaddsForFcTool, Set conditionalAddsesForDestinationPuid,
			Set slotMisForMt, Set networkCables, Set opsysesForSupFc, Set procAddonMapsForProcAddonPuid,
			Set procAddonMapsForProcInitPuid, Set rackLimitsForRack, Set solutionCatsForSolFc, Set puidCtryComps,
			Set cogRacks, Set chgHists, Set categoryProdGrps, Set overideDatesesForMtPuid, Set memMapsForHvecMem,
			Set xccHvecsForXcc, Set relChngs, Set oemDatas, Set xccPricesForFeat, Set pduMapsForHvecPdu,
			Set servpacTrgtsyses) {
		super();
		this.puid = puid;
		this.functionalType = functionalType;
		this.category = category;
		this.brand = brand;
		this.mfg = mfg;
		this.description = description;
		this.mt = mt;
		this.model = model;
		this.featCode = featCode;
		this.ppn = ppn;
		this.fruPn = fruPn;
		this.optPn = optPn;
		this.mfgPn = mfgPn;
		this.sbb = sbb;
		this.mfi = mfi;
		this.ffi = ffi;
		this.price = price;
		this.modelx = modelx;
		this.visible = visible;
		this.fcAas = fcAas;
		this.passthru = passthru;
		this.xccVld = xccVld;
		this.bhcId = bhcId;
		this.bhcFeat = bhcFeat;
		this.customerSelected = customerSelected;
		this.priced = priced;
		this.poptPn = poptPn;
		this.addHists = addHists;
		this.opsysesForProcFc = opsysesForProcFc;
		this.prodP2pLocations = prodP2pLocations;
		this.servpacs = servpacs;
		this.requiredAddsesForReqAdd = requiredAddsesForReqAdd;
		this.rackings = rackings;
		this.fillerses = fillerses;
		this.fcAllautos = fcAllautos;
		this.defaultAddsesForProduct = defaultAddsesForProduct;
		this.requiredAddsesForProd2 = requiredAddsesForProd2;
		this.gavMapsForOpt = gavMapsForOpt;
		this.ndpses = ndpses;
		this.overideDatesesForSbbPuid = overideDatesesForSbbPuid;
		this.xccHvecsForHvec = xccHvecsForHvec;
		this.opsysesForLicense = opsysesForLicense;
		this.usrComts = usrComts;
		this.solutionCatsForSolSbFc = solutionCatsForSolSbFc;
		this.prdLocks = prdLocks;
		this.pduMapsForHvecCbl = pduMapsForHvecCbl;
		this.networkHcas = networkHcas;
		this.procMaps = procMaps;
		this.fcAutoaddsForFcAdd = fcAutoaddsForFcAdd;
		this.networkSwitchs = networkSwitchs;
		this.placementMaps = placementMaps;
		this.connLayoutMaps = connLayoutMaps;
		this.conditionalAddsesForSourceBPuid = conditionalAddsesForSourceBPuid;
		this.relProds = relProds;
		this.conditionalAddsesForSourceDPuid = conditionalAddsesForSourceDPuid;
		this.connectorReplcmnts = connectorReplcmnts;
		this.pwrMaps = pwrMaps;
		this.softwareRoutings = softwareRoutings;
		this.gavMapsForXccMt = gavMapsForXccMt;
		this.ecs = ecs;
		this.conditionalAddsesForSourceCPuid = conditionalAddsesForSourceCPuid;
		this.defaultAddsesForDfltAdd = defaultAddsesForDfltAdd;
		this.pduMapsForXccPdu = pduMapsForXccPdu;
		this.opsysesForServer = opsysesForServer;
		this.masterCompatMapsForCompPuid = masterCompatMapsForCompPuid;
		this.opsysSelectsForFeature = opsysSelectsForFeature;
		this.conditionalAddsesForSourceAPuid = conditionalAddsesForSourceAPuid;
		this.prodShortLbls = prodShortLbls;
		this.incompatsForPuid2 = incompatsForPuid2;
		this.gavMapsForHvecMtm = gavMapsForHvecMtm;
		this.memMapsForXccMem = memMapsForXccMem;
		this.subComponentsesForSubCompPuid = subComponentsesForSubCompPuid;
		this.prdFcs = prdFcs;
		this.salesItemses = salesItemses;
		this.incompatsForPuid1 = incompatsForPuid1;
		this.subComponentsesForCompPuid = subComponentsesForCompPuid;
		this.replaceProductsForPuid = replaceProductsForPuid;
		this.prodPics = prodPics;
		this.replaceProductsForReplacementPuid = replaceProductsForReplacementPuid;
		PDateses = pDateses;
		this.opsysesForOsFc = opsysesForOsFc;
		this.supAddsesForProd1 = supAddsesForProd1;
		this.masterCompatMapsForMtPuid = masterCompatMapsForMtPuid;
		this.supAddsesForSupAdd = supAddsesForSupAdd;
		this.requiredAddsesForProd1 = requiredAddsesForProd1;
		this.supAddsesForProd2 = supAddsesForProd2;
		this.productGroups = productGroups;
		this.olbBoxerIncomps = olbBoxerIncomps;
		this.xccPricesForMt = xccPricesForMt;
		this.opsysSelectsForMedKit = opsysSelectsForMedKit;
		this.conditionalAddsesForResultPuid = conditionalAddsesForResultPuid;
		this.opsysSelectsForSftwrPid = opsysSelectsForSftwrPid;
		this.slotMisForOpt = slotMisForOpt;
		this.rackLimitsForProduct = rackLimitsForProduct;
		this.fcAutoaddsForFcTool = fcAutoaddsForFcTool;
		this.conditionalAddsesForDestinationPuid = conditionalAddsesForDestinationPuid;
		this.slotMisForMt = slotMisForMt;
		this.networkCables = networkCables;
		this.opsysesForSupFc = opsysesForSupFc;
		this.procAddonMapsForProcAddonPuid = procAddonMapsForProcAddonPuid;
		this.procAddonMapsForProcInitPuid = procAddonMapsForProcInitPuid;
		this.rackLimitsForRack = rackLimitsForRack;
		this.solutionCatsForSolFc = solutionCatsForSolFc;
		this.puidCtryComps = puidCtryComps;
		this.cogRacks = cogRacks;
		this.chgHists = chgHists;
		this.categoryProdGrps = categoryProdGrps;
		this.overideDatesesForMtPuid = overideDatesesForMtPuid;
		this.memMapsForHvecMem = memMapsForHvecMem;
		this.xccHvecsForXcc = xccHvecsForXcc;
		this.relChngs = relChngs;
		this.oemDatas = oemDatas;
		this.xccPricesForFeat = xccPricesForFeat;
		this.pduMapsForHvecPdu = pduMapsForHvecPdu;
		this.servpacTrgtsyses = servpacTrgtsyses;
	}

	public Long getPuid() {
		return this.puid;
	}

	public void setPuid(Long puid) {
		this.puid = puid;
	}

	public FunctionalType getFunctionalType() {
		return this.functionalType;
	}

	public void setFunctionalType(FunctionalType functionalType) {
		this.functionalType = functionalType;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return this.brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Mfg getMfg() {
		return this.mfg;
	}

	public void setMfg(Mfg mfg) {
		this.mfg = mfg;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMt() {
		return this.mt;
	}

	public void setMt(String mt) {
		this.mt = mt;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getFeatCode() {
		return this.featCode;
	}

	public void setFeatCode(String featCode) {
		this.featCode = featCode;
	}

	public String getPpn() {
		return this.ppn;
	}

	public void setPpn(String ppn) {
		this.ppn = ppn;
	}

	public String getFruPn() {
		return this.fruPn;
	}

	public void setFruPn(String fruPn) {
		this.fruPn = fruPn;
	}

	public String getOptPn() {
		return this.optPn;
	}

	public void setOptPn(String optPn) {
		this.optPn = optPn;
	}

	public String getMfgPn() {
		return this.mfgPn;
	}

	public void setMfgPn(String mfgPn) {
		this.mfgPn = mfgPn;
	}

	public String getSbb() {
		return this.sbb;
	}

	public void setSbb(String sbb) {
		this.sbb = sbb;
	}

	public String getMfi() {
		return this.mfi;
	}

	public void setMfi(String mfi) {
		this.mfi = mfi;
	}

	public String getFfi() {
		return this.ffi;
	}

	public void setFfi(String ffi) {
		this.ffi = ffi;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getModelx() {
		return this.modelx;
	}

	public void setModelx(String modelx) {
		this.modelx = modelx;
	}

	public Character getVisible() {
		return visible;
	}

	public void setVisible(Character visible) {
		this.visible = visible;
	}

	public String getFcAas() {
		return fcAas;
	}

	public void setFcAas(String fcAas) {
		this.fcAas = fcAas;
	}

	public Character getPassthru() {
		return passthru;
	}

	public void setPassthru(Character passthru) {
		this.passthru = passthru;
	}

	public Character getXccVld() {
		return xccVld;
	}

	public void setXccVld(Character xccVld) {
		this.xccVld = xccVld;
	}

	public String getBhcId() {
		return this.bhcId;
	}

	public void setBhcId(String bhcId) {
		this.bhcId = bhcId;
	}

	public String getBhcFeat() {
		return this.bhcFeat;
	}

	public void setBhcFeat(String bhcFeat) {
		this.bhcFeat = bhcFeat;
	}

	public String getCustomerSelected() {
		return this.customerSelected;
	}

	public void setCustomerSelected(String customerSelected) {
		this.customerSelected = customerSelected;
	}

	public String getPriced() {
		return this.priced;
	}

	public void setPriced(String priced) {
		this.priced = priced;
	}

	public String getPoptPn() {
		return this.poptPn;
	}

	public void setPoptPn(String poptPn) {
		this.poptPn = poptPn;
	}

	public Set getAddHists() {
		return this.addHists;
	}

	public void setAddHists(Set addHists) {
		this.addHists = addHists;
	}

	public Set getOpsysesForProcFc() {
		return this.opsysesForProcFc;
	}

	public void setOpsysesForProcFc(Set opsysesForProcFc) {
		this.opsysesForProcFc = opsysesForProcFc;
	}

	public Set getProdP2pLocations() {
		return this.prodP2pLocations;
	}

	public void setProdP2pLocations(Set prodP2pLocations) {
		this.prodP2pLocations = prodP2pLocations;
	}

	public Set getServpacs() {
		return this.servpacs;
	}

	public void setServpacs(Set servpacs) {
		this.servpacs = servpacs;
	}

	public Set getRequiredAddsesForReqAdd() {
		return this.requiredAddsesForReqAdd;
	}

	public void setRequiredAddsesForReqAdd(Set requiredAddsesForReqAdd) {
		this.requiredAddsesForReqAdd = requiredAddsesForReqAdd;
	}

	public Set getRackings() {
		return this.rackings;
	}

	public void setRackings(Set rackings) {
		this.rackings = rackings;
	}

	public Set getFillerses() {
		return this.fillerses;
	}

	public void setFillerses(Set fillerses) {
		this.fillerses = fillerses;
	}

	public Set getFcAllautos() {
		return this.fcAllautos;
	}

	public void setFcAllautos(Set fcAllautos) {
		this.fcAllautos = fcAllautos;
	}

	public Set getDefaultAddsesForProduct() {
		return this.defaultAddsesForProduct;
	}

	public void setDefaultAddsesForProduct(Set defaultAddsesForProduct) {
		this.defaultAddsesForProduct = defaultAddsesForProduct;
	}

	public Set getRequiredAddsesForProd2() {
		return this.requiredAddsesForProd2;
	}

	public void setRequiredAddsesForProd2(Set requiredAddsesForProd2) {
		this.requiredAddsesForProd2 = requiredAddsesForProd2;
	}

	public Set getGavMapsForOpt() {
		return this.gavMapsForOpt;
	}

	public void setGavMapsForOpt(Set gavMapsForOpt) {
		this.gavMapsForOpt = gavMapsForOpt;
	}

	public Set getNdpses() {
		return this.ndpses;
	}

	public void setNdpses(Set ndpses) {
		this.ndpses = ndpses;
	}

	public Set getOverideDatesesForSbbPuid() {
		return this.overideDatesesForSbbPuid;
	}

	public void setOverideDatesesForSbbPuid(Set overideDatesesForSbbPuid) {
		this.overideDatesesForSbbPuid = overideDatesesForSbbPuid;
	}

	public Set getXccHvecsForHvec() {
		return this.xccHvecsForHvec;
	}

	public void setXccHvecsForHvec(Set xccHvecsForHvec) {
		this.xccHvecsForHvec = xccHvecsForHvec;
	}

	public Set getOpsysesForLicense() {
		return this.opsysesForLicense;
	}

	public void setOpsysesForLicense(Set opsysesForLicense) {
		this.opsysesForLicense = opsysesForLicense;
	}

	public Set getUsrComts() {
		return this.usrComts;
	}

	public void setUsrComts(Set usrComts) {
		this.usrComts = usrComts;
	}

	public Set getSolutionCatsForSolSbFc() {
		return this.solutionCatsForSolSbFc;
	}

	public void setSolutionCatsForSolSbFc(Set solutionCatsForSolSbFc) {
		this.solutionCatsForSolSbFc = solutionCatsForSolSbFc;
	}

	public Set getPrdLocks() {
		return this.prdLocks;
	}

	public void setPrdLocks(Set prdLocks) {
		this.prdLocks = prdLocks;
	}

	public Set getPduMapsForHvecCbl() {
		return this.pduMapsForHvecCbl;
	}

	public void setPduMapsForHvecCbl(Set pduMapsForHvecCbl) {
		this.pduMapsForHvecCbl = pduMapsForHvecCbl;
	}

	public Set getNetworkHcas() {
		return this.networkHcas;
	}

	public void setNetworkHcas(Set networkHcas) {
		this.networkHcas = networkHcas;
	}

	public Set getProcMaps() {
		return this.procMaps;
	}

	public void setProcMaps(Set procMaps) {
		this.procMaps = procMaps;
	}

	public Set getFcAutoaddsForFcAdd() {
		return this.fcAutoaddsForFcAdd;
	}

	public void setFcAutoaddsForFcAdd(Set fcAutoaddsForFcAdd) {
		this.fcAutoaddsForFcAdd = fcAutoaddsForFcAdd;
	}

	public Set getNetworkSwitchs() {
		return this.networkSwitchs;
	}

	public void setNetworkSwitchs(Set networkSwitchs) {
		this.networkSwitchs = networkSwitchs;
	}

	public Set getPlacementMaps() {
		return this.placementMaps;
	}

	public void setPlacementMaps(Set placementMaps) {
		this.placementMaps = placementMaps;
	}

	public Set getConnLayoutMaps() {
		return this.connLayoutMaps;
	}

	public void setConnLayoutMaps(Set connLayoutMaps) {
		this.connLayoutMaps = connLayoutMaps;
	}

	public Set getConditionalAddsesForSourceBPuid() {
		return this.conditionalAddsesForSourceBPuid;
	}

	public void setConditionalAddsesForSourceBPuid(Set conditionalAddsesForSourceBPuid) {
		this.conditionalAddsesForSourceBPuid = conditionalAddsesForSourceBPuid;
	}

	public Set getRelProds() {
		return this.relProds;
	}

	public void setRelProds(Set relProds) {
		this.relProds = relProds;
	}

	public Set getConditionalAddsesForSourceDPuid() {
		return this.conditionalAddsesForSourceDPuid;
	}

	public void setConditionalAddsesForSourceDPuid(Set conditionalAddsesForSourceDPuid) {
		this.conditionalAddsesForSourceDPuid = conditionalAddsesForSourceDPuid;
	}

	public Set getConnectorReplcmnts() {
		return this.connectorReplcmnts;
	}

	public void setConnectorReplcmnts(Set connectorReplcmnts) {
		this.connectorReplcmnts = connectorReplcmnts;
	}

	public Set getPwrMaps() {
		return this.pwrMaps;
	}

	public void setPwrMaps(Set pwrMaps) {
		this.pwrMaps = pwrMaps;
	}

	public Set getSoftwareRoutings() {
		return this.softwareRoutings;
	}

	public void setSoftwareRoutings(Set softwareRoutings) {
		this.softwareRoutings = softwareRoutings;
	}

	public Set getGavMapsForXccMt() {
		return this.gavMapsForXccMt;
	}

	public void setGavMapsForXccMt(Set gavMapsForXccMt) {
		this.gavMapsForXccMt = gavMapsForXccMt;
	}

	public Set getEcs() {
		return this.ecs;
	}

	public void setEcs(Set ecs) {
		this.ecs = ecs;
	}

	public Set getConditionalAddsesForSourceCPuid() {
		return this.conditionalAddsesForSourceCPuid;
	}

	public void setConditionalAddsesForSourceCPuid(Set conditionalAddsesForSourceCPuid) {
		this.conditionalAddsesForSourceCPuid = conditionalAddsesForSourceCPuid;
	}

	public Set getDefaultAddsesForDfltAdd() {
		return this.defaultAddsesForDfltAdd;
	}

	public void setDefaultAddsesForDfltAdd(Set defaultAddsesForDfltAdd) {
		this.defaultAddsesForDfltAdd = defaultAddsesForDfltAdd;
	}

	public Set getPduMapsForXccPdu() {
		return this.pduMapsForXccPdu;
	}

	public void setPduMapsForXccPdu(Set pduMapsForXccPdu) {
		this.pduMapsForXccPdu = pduMapsForXccPdu;
	}

	public Set getOpsysesForServer() {
		return this.opsysesForServer;
	}

	public void setOpsysesForServer(Set opsysesForServer) {
		this.opsysesForServer = opsysesForServer;
	}

	public Set getMasterCompatMapsForCompPuid() {
		return this.masterCompatMapsForCompPuid;
	}

	public void setMasterCompatMapsForCompPuid(Set masterCompatMapsForCompPuid) {
		this.masterCompatMapsForCompPuid = masterCompatMapsForCompPuid;
	}

	public Set getOpsysSelectsForFeature() {
		return this.opsysSelectsForFeature;
	}

	public void setOpsysSelectsForFeature(Set opsysSelectsForFeature) {
		this.opsysSelectsForFeature = opsysSelectsForFeature;
	}

	public Set getConditionalAddsesForSourceAPuid() {
		return this.conditionalAddsesForSourceAPuid;
	}

	public void setConditionalAddsesForSourceAPuid(Set conditionalAddsesForSourceAPuid) {
		this.conditionalAddsesForSourceAPuid = conditionalAddsesForSourceAPuid;
	}

	public Set getProdShortLbls() {
		return this.prodShortLbls;
	}

	public void setProdShortLbls(Set prodShortLbls) {
		this.prodShortLbls = prodShortLbls;
	}

	public Set getIncompatsForPuid2() {
		return this.incompatsForPuid2;
	}

	public void setIncompatsForPuid2(Set incompatsForPuid2) {
		this.incompatsForPuid2 = incompatsForPuid2;
	}

	public Set getGavMapsForHvecMtm() {
		return this.gavMapsForHvecMtm;
	}

	public void setGavMapsForHvecMtm(Set gavMapsForHvecMtm) {
		this.gavMapsForHvecMtm = gavMapsForHvecMtm;
	}

	public Set getMemMapsForXccMem() {
		return this.memMapsForXccMem;
	}

	public void setMemMapsForXccMem(Set memMapsForXccMem) {
		this.memMapsForXccMem = memMapsForXccMem;
	}

	public Set getSubComponentsesForSubCompPuid() {
		return this.subComponentsesForSubCompPuid;
	}

	public void setSubComponentsesForSubCompPuid(Set subComponentsesForSubCompPuid) {
		this.subComponentsesForSubCompPuid = subComponentsesForSubCompPuid;
	}

	public Set getPrdFcs() {
		return this.prdFcs;
	}

	public void setPrdFcs(Set prdFcs) {
		this.prdFcs = prdFcs;
	}

	public Set getSalesItemses() {
		return this.salesItemses;
	}

	public void setSalesItemses(Set salesItemses) {
		this.salesItemses = salesItemses;
	}

	public Set getIncompatsForPuid1() {
		return this.incompatsForPuid1;
	}

	public void setIncompatsForPuid1(Set incompatsForPuid1) {
		this.incompatsForPuid1 = incompatsForPuid1;
	}

	public Set getSubComponentsesForCompPuid() {
		return this.subComponentsesForCompPuid;
	}

	public void setSubComponentsesForCompPuid(Set subComponentsesForCompPuid) {
		this.subComponentsesForCompPuid = subComponentsesForCompPuid;
	}

	public Set getReplaceProductsForPuid() {
		return this.replaceProductsForPuid;
	}

	public void setReplaceProductsForPuid(Set replaceProductsForPuid) {
		this.replaceProductsForPuid = replaceProductsForPuid;
	}

	public Set getProdPics() {
		return this.prodPics;
	}

	public void setProdPics(Set prodPics) {
		this.prodPics = prodPics;
	}

	public Set getReplaceProductsForReplacementPuid() {
		return this.replaceProductsForReplacementPuid;
	}

	public void setReplaceProductsForReplacementPuid(Set replaceProductsForReplacementPuid) {
		this.replaceProductsForReplacementPuid = replaceProductsForReplacementPuid;
	}

	public Set getPDateses() {
		return this.PDateses;
	}

	public void setPDateses(Set PDateses) {
		this.PDateses = PDateses;
	}

	public Set getOpsysesForOsFc() {
		return this.opsysesForOsFc;
	}

	public void setOpsysesForOsFc(Set opsysesForOsFc) {
		this.opsysesForOsFc = opsysesForOsFc;
	}

	public Set getSupAddsesForProd1() {
		return this.supAddsesForProd1;
	}

	public void setSupAddsesForProd1(Set supAddsesForProd1) {
		this.supAddsesForProd1 = supAddsesForProd1;
	}

	public Set getMasterCompatMapsForMtPuid() {
		return this.masterCompatMapsForMtPuid;
	}

	public void setMasterCompatMapsForMtPuid(Set masterCompatMapsForMtPuid) {
		this.masterCompatMapsForMtPuid = masterCompatMapsForMtPuid;
	}

	public Set getSupAddsesForSupAdd() {
		return this.supAddsesForSupAdd;
	}

	public void setSupAddsesForSupAdd(Set supAddsesForSupAdd) {
		this.supAddsesForSupAdd = supAddsesForSupAdd;
	}

	public Set getRequiredAddsesForProd1() {
		return this.requiredAddsesForProd1;
	}

	public void setRequiredAddsesForProd1(Set requiredAddsesForProd1) {
		this.requiredAddsesForProd1 = requiredAddsesForProd1;
	}

	public Set getSupAddsesForProd2() {
		return this.supAddsesForProd2;
	}

	public void setSupAddsesForProd2(Set supAddsesForProd2) {
		this.supAddsesForProd2 = supAddsesForProd2;
	}

	public Set getProductGroups() {
		return this.productGroups;
	}

	public void setProductGroups(Set productGroups) {
		this.productGroups = productGroups;
	}

	public Set getOlbBoxerIncomps() {
		return this.olbBoxerIncomps;
	}

	public void setOlbBoxerIncomps(Set olbBoxerIncomps) {
		this.olbBoxerIncomps = olbBoxerIncomps;
	}

	public Set getXccPricesForMt() {
		return this.xccPricesForMt;
	}

	public void setXccPricesForMt(Set xccPricesForMt) {
		this.xccPricesForMt = xccPricesForMt;
	}

	public Set getOpsysSelectsForMedKit() {
		return this.opsysSelectsForMedKit;
	}

	public void setOpsysSelectsForMedKit(Set opsysSelectsForMedKit) {
		this.opsysSelectsForMedKit = opsysSelectsForMedKit;
	}

	public Set getConditionalAddsesForResultPuid() {
		return this.conditionalAddsesForResultPuid;
	}

	public void setConditionalAddsesForResultPuid(Set conditionalAddsesForResultPuid) {
		this.conditionalAddsesForResultPuid = conditionalAddsesForResultPuid;
	}

	public Set getOpsysSelectsForSftwrPid() {
		return this.opsysSelectsForSftwrPid;
	}

	public void setOpsysSelectsForSftwrPid(Set opsysSelectsForSftwrPid) {
		this.opsysSelectsForSftwrPid = opsysSelectsForSftwrPid;
	}

	public Set getSlotMisForOpt() {
		return this.slotMisForOpt;
	}

	public void setSlotMisForOpt(Set slotMisForOpt) {
		this.slotMisForOpt = slotMisForOpt;
	}

	public Set getRackLimitsForProduct() {
		return this.rackLimitsForProduct;
	}

	public void setRackLimitsForProduct(Set rackLimitsForProduct) {
		this.rackLimitsForProduct = rackLimitsForProduct;
	}

	public Set getFcAutoaddsForFcTool() {
		return this.fcAutoaddsForFcTool;
	}

	public void setFcAutoaddsForFcTool(Set fcAutoaddsForFcTool) {
		this.fcAutoaddsForFcTool = fcAutoaddsForFcTool;
	}

	public Set getConditionalAddsesForDestinationPuid() {
		return this.conditionalAddsesForDestinationPuid;
	}

	public void setConditionalAddsesForDestinationPuid(Set conditionalAddsesForDestinationPuid) {
		this.conditionalAddsesForDestinationPuid = conditionalAddsesForDestinationPuid;
	}

	public Set getSlotMisForMt() {
		return this.slotMisForMt;
	}

	public void setSlotMisForMt(Set slotMisForMt) {
		this.slotMisForMt = slotMisForMt;
	}

	public Set getNetworkCables() {
		return this.networkCables;
	}

	public void setNetworkCables(Set networkCables) {
		this.networkCables = networkCables;
	}

	public Set getOpsysesForSupFc() {
		return this.opsysesForSupFc;
	}

	public void setOpsysesForSupFc(Set opsysesForSupFc) {
		this.opsysesForSupFc = opsysesForSupFc;
	}

	public Set getProcAddonMapsForProcAddonPuid() {
		return this.procAddonMapsForProcAddonPuid;
	}

	public void setProcAddonMapsForProcAddonPuid(Set procAddonMapsForProcAddonPuid) {
		this.procAddonMapsForProcAddonPuid = procAddonMapsForProcAddonPuid;
	}

	public Set getProcAddonMapsForProcInitPuid() {
		return this.procAddonMapsForProcInitPuid;
	}

	public void setProcAddonMapsForProcInitPuid(Set procAddonMapsForProcInitPuid) {
		this.procAddonMapsForProcInitPuid = procAddonMapsForProcInitPuid;
	}

	public Set getRackLimitsForRack() {
		return this.rackLimitsForRack;
	}

	public void setRackLimitsForRack(Set rackLimitsForRack) {
		this.rackLimitsForRack = rackLimitsForRack;
	}

	public Set getSolutionCatsForSolFc() {
		return this.solutionCatsForSolFc;
	}

	public void setSolutionCatsForSolFc(Set solutionCatsForSolFc) {
		this.solutionCatsForSolFc = solutionCatsForSolFc;
	}

	public Set getPuidCtryComps() {
		return this.puidCtryComps;
	}

	public void setPuidCtryComps(Set puidCtryComps) {
		this.puidCtryComps = puidCtryComps;
	}

	public Set getCogRacks() {
		return this.cogRacks;
	}

	public void setCogRacks(Set cogRacks) {
		this.cogRacks = cogRacks;
	}

	public Set getChgHists() {
		return this.chgHists;
	}

	public void setChgHists(Set chgHists) {
		this.chgHists = chgHists;
	}

	public Set getCategoryProdGrps() {
		return this.categoryProdGrps;
	}

	public void setCategoryProdGrps(Set categoryProdGrps) {
		this.categoryProdGrps = categoryProdGrps;
	}

	public Set getOverideDatesesForMtPuid() {
		return this.overideDatesesForMtPuid;
	}

	public void setOverideDatesesForMtPuid(Set overideDatesesForMtPuid) {
		this.overideDatesesForMtPuid = overideDatesesForMtPuid;
	}

	public Set getMemMapsForHvecMem() {
		return this.memMapsForHvecMem;
	}

	public void setMemMapsForHvecMem(Set memMapsForHvecMem) {
		this.memMapsForHvecMem = memMapsForHvecMem;
	}

	public Set getXccHvecsForXcc() {
		return this.xccHvecsForXcc;
	}

	public void setXccHvecsForXcc(Set xccHvecsForXcc) {
		this.xccHvecsForXcc = xccHvecsForXcc;
	}

	public Set getRelChngs() {
		return this.relChngs;
	}

	public void setRelChngs(Set relChngs) {
		this.relChngs = relChngs;
	}

	public Set getOemDatas() {
		return this.oemDatas;
	}

	public void setOemDatas(Set oemDatas) {
		this.oemDatas = oemDatas;
	}

	public Set getXccPricesForFeat() {
		return this.xccPricesForFeat;
	}

	public void setXccPricesForFeat(Set xccPricesForFeat) {
		this.xccPricesForFeat = xccPricesForFeat;
	}

	public Set getPduMapsForHvecPdu() {
		return this.pduMapsForHvecPdu;
	}

	public void setPduMapsForHvecPdu(Set pduMapsForHvecPdu) {
		this.pduMapsForHvecPdu = pduMapsForHvecPdu;
	}

	public Set getServpacTrgtsyses() {
		return this.servpacTrgtsyses;
	}

	public void setServpacTrgtsyses(Set servpacTrgtsyses) {
		this.servpacTrgtsyses = servpacTrgtsyses;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "======\tProduct: [puid=" + puid + ", functionalType=" + functionalType + ", category=" + category
				+ ", brand=" + brand + ", mfg=" + mfg + ", description=" + description + ", mt=" + mt + ", model="
				+ model + ", featCode=" + featCode + ", ppn=" + ppn + ", fruPn=" + fruPn + ", optPn=" + optPn
				+ ", mfgPn=" + mfgPn + ", sbb=" + sbb + ", mfi=" + mfi + ", ffi=" + ffi + ", price=" + price
				+ ", modelx=" + modelx + ", visible=" + visible + ", fcAas=" + fcAas + ", passthru=" + passthru
				+ ", xccVld=" + xccVld + ", bhcId=" + bhcId + ", bhcFeat=" + bhcFeat + ", customerSelected="
				+ customerSelected + ", priced=" + priced + ", poptPn=" + poptPn + ", addHists=" + addHists
				+ ", opsysesForProcFc=" + opsysesForProcFc + ", prodP2pLocations=" + prodP2pLocations + ", servpacs="
				+ servpacs + ", requiredAddsesForReqAdd=" + requiredAddsesForReqAdd + ", rackings=" + rackings
				+ ", fillerses=" + fillerses + ", fcAllautos=" + fcAllautos + ", defaultAddsesForProduct="
				+ defaultAddsesForProduct + ", requiredAddsesForProd2=" + requiredAddsesForProd2 + ", gavMapsForOpt="
				+ gavMapsForOpt + ", ndpses=" + ndpses + ", overideDatesesForSbbPuid=" + overideDatesesForSbbPuid
				+ ", xccHvecsForHvec=" + xccHvecsForHvec + ", opsysesForLicense=" + opsysesForLicense + ", usrComts="
				+ usrComts + ", solutionCatsForSolSbFc=" + solutionCatsForSolSbFc + ", prdLocks=" + prdLocks
				+ ", pduMapsForHvecCbl=" + pduMapsForHvecCbl + ", networkHcas=" + networkHcas + ", procMaps="
				+ procMaps + ", fcAutoaddsForFcAdd=" + fcAutoaddsForFcAdd + ", networkSwitchs=" + networkSwitchs
				+ ", placementMaps=" + placementMaps + ", connLayoutMaps=" + connLayoutMaps
				+ ", conditionalAddsesForSourceBPuid=" + conditionalAddsesForSourceBPuid + ", relProds=" + relProds
				+ ", conditionalAddsesForSourceDPuid=" + conditionalAddsesForSourceDPuid + ", connectorReplcmnts="
				+ connectorReplcmnts + ", pwrMaps=" + pwrMaps + ", softwareRoutings=" + softwareRoutings
				+ ", gavMapsForXccMt=" + gavMapsForXccMt + ", ecs=" + ecs + ", conditionalAddsesForSourceCPuid="
				+ conditionalAddsesForSourceCPuid + ", defaultAddsesForDfltAdd=" + defaultAddsesForDfltAdd
				+ ", pduMapsForXccPdu=" + pduMapsForXccPdu + ", opsysesForServer=" + opsysesForServer
				+ ", masterCompatMapsForCompPuid=" + masterCompatMapsForCompPuid + ", opsysSelectsForFeature="
				+ opsysSelectsForFeature + ", conditionalAddsesForSourceAPuid=" + conditionalAddsesForSourceAPuid
				+ ", prodShortLbls=" + prodShortLbls + ", incompatsForPuid2=" + incompatsForPuid2
				+ ", gavMapsForHvecMtm=" + gavMapsForHvecMtm + ", memMapsForXccMem=" + memMapsForXccMem
				+ ", subComponentsesForSubCompPuid=" + subComponentsesForSubCompPuid + ", prdFcs=" + prdFcs
				+ ", salesItemses=" + salesItemses + ", incompatsForPuid1=" + incompatsForPuid1
				+ ", subComponentsesForCompPuid=" + subComponentsesForCompPuid + ", replaceProductsForPuid="
				+ replaceProductsForPuid + ", prodPics=" + prodPics + ", replaceProductsForReplacementPuid="
				+ replaceProductsForReplacementPuid + ", PDateses=" + PDateses + ", opsysesForOsFc=" + opsysesForOsFc
				+ ", supAddsesForProd1=" + supAddsesForProd1 + ", masterCompatMapsForMtPuid="
				+ masterCompatMapsForMtPuid + ", supAddsesForSupAdd=" + supAddsesForSupAdd
				+ ", requiredAddsesForProd1=" + requiredAddsesForProd1 + ", supAddsesForProd2=" + supAddsesForProd2
				+ ", productGroups=" + productGroups + ", olbBoxerIncomps=" + olbBoxerIncomps + ", xccPricesForMt="
				+ xccPricesForMt + ", opsysSelectsForMedKit=" + opsysSelectsForMedKit
				+ ", conditionalAddsesForResultPuid=" + conditionalAddsesForResultPuid + ", opsysSelectsForSftwrPid="
				+ opsysSelectsForSftwrPid + ", slotMisForOpt=" + slotMisForOpt + ", rackLimitsForProduct="
				+ rackLimitsForProduct + ", fcAutoaddsForFcTool=" + fcAutoaddsForFcTool
				+ ", conditionalAddsesForDestinationPuid=" + conditionalAddsesForDestinationPuid + ", slotMisForMt="
				+ slotMisForMt + ", networkCables=" + networkCables + ", opsysesForSupFc=" + opsysesForSupFc
				+ ", procAddonMapsForProcAddonPuid=" + procAddonMapsForProcAddonPuid
				+ ", procAddonMapsForProcInitPuid=" + procAddonMapsForProcInitPuid + ", rackLimitsForRack="
				+ rackLimitsForRack + ", solutionCatsForSolFc=" + solutionCatsForSolFc + ", puidCtryComps="
				+ puidCtryComps + ", cogRacks=" + cogRacks + ", chgHists=" + chgHists + ", categoryProdGrps="
				+ categoryProdGrps + ", overideDatesesForMtPuid=" + overideDatesesForMtPuid + ", memMapsForHvecMem="
				+ memMapsForHvecMem + ", xccHvecsForXcc=" + xccHvecsForXcc + ", relChngs=" + relChngs + ", oemDatas="
				+ oemDatas + ", xccPricesForFeat=" + xccPricesForFeat + ", pduMapsForHvecPdu=" + pduMapsForHvecPdu
				+ ", servpacTrgtsyses=" + servpacTrgtsyses + "]";
	}

	/**
	 * @return the releases
	 */
	public Set getReleases() {
		return releases;
	}

	/**
	 * @param releases
	 *            the releases to set
	 */
	public void setReleases(Set releases) {
		this.releases = releases;
	}

}