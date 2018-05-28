package at.fh.swenga.grazious.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserCharakter")
public class UserCharakterModel {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	// A

	@Column(name = "abenteuerlustig")
	private boolean abenteuerlustig;

	@Column(name = "aberglueubisch")
	private boolean aberglueubisch;

	@Column(name = "absprachefuehig")
	private boolean absprachefuehig;

	@Column(name = "achtsam")
	private boolean achtsam;

	@Column(name = "adrett")
	private boolean adrett;

	@Column(name = "affektiert")
	private boolean affektiert;

	@Column(name = "agil")
	private boolean agil;

	@Column(name = "akkurat")
	private boolean akkurat;

	@Column(name = "akribisch")
	private boolean akribisch;

	@Column(name = "aktiv")
	private boolean aktiv;

	@Column(name = "albern")
	private boolean albern;

	@Column(name = "altmodisch")
	private boolean altmodisch;

	@Column(name = "ambitioniert")
	private boolean ambitioniert;

	@Column(name = "amuesant")
	private boolean amuesant;

	@Column(name = "analytisch")
	private boolean analytisch;

	@Column(name = "anders")
	private boolean anders;

	@Column(name = "angepasst")
	private boolean angepasst;

	@Column(name = "angespannt")
	private boolean angespannt;

	@Column(name = "angriffslustig")
	private boolean angriffslustig;

	@Column(name = "angstfrei")
	private boolean angstfrei;

	@Column(name = "anmutig")
	private boolean anmutig;

	@Column(name = "annehmend")
	private boolean annehmend;

	@Column(name = "anpackend")
	private boolean anpackend;

	@Column(name = "anpassungsbereit")
	private boolean anpassungsbereit;

	@Column(name = "anpassungsfuehig")
	private boolean anpassungsfuehig;

	@Column(name = "anspruchslos")
	private boolean anspruchslos;

	@Column(name = "anspruchsvoll")
	private boolean anspruchsvoll;

	@Column(name = "anstuendig")
	private boolean anstuendig;

	@Column(name = "anstrengend")
	private boolean anstrengend;

	@Column(name = "arbeitsam")
	private boolean arbeitsam;

	@Column(name = "athletisch")
	private boolean athletisch;

	@Column(name = "aufbauend")
	private boolean aufbauend;

	@Column(name = "aufgeschlossen")
	private boolean aufgeschlossen;

	@Column(name = "aufgeweckt")
	private boolean aufgeweckt;

	@Column(name = "aufmerksam")
	private boolean aufmerksam;

	@Column(name = "aufmunternd")
	private boolean aufmunternd;

	@Column(name = "aufopferungsvoll")
	private boolean aufopferungsvoll;

	@Column(name = "aufregend")
	private boolean aufregend;

	@Column(name = "aufrichtig")
	private boolean aufrichtig;

	@Column(name = "ausdauernd")
	private boolean ausdauernd;

	@Column(name = "ausdrucksstark")
	private boolean ausdrucksstark;

	@Column(name = "ausluenderfreundlich")
	private boolean ausluenderfreundlich;

	@Column(name = "authentisch")
	private boolean authentisch;

	@Column(name = "autonom")
	private boolean autonom;

	@Column(name = "autorituer")
	private boolean autorituer;

	// B
	@Column(name = "bedacht")
	private boolean bedacht;

	@Column(name = "bedenkenlos")
	private boolean bedenkenlos;

	@Column(name = "begabt")
	private boolean begabt;

	@Column(name = "begeisterungsfuehig")
	private boolean begeisterungsfuehig;

	@Column(name = "begnuegsam")
	private boolean begnuegsam;

	@Column(name = "beherzt")
	private boolean beherzt;

	@Column(name = "behutsam")
	private boolean behutsam;

	@Column(name = "belastbar")
	private boolean belastbar;

	@Column(name = "belesen")
	private boolean belesen;

	@Column(name = "beliebt")
	private boolean beliebt;

	@Column(name = "bemutternd")
	private boolean bemutternd;

	@Column(name = "bescheiden")
	private boolean bescheiden;

	@Column(name = "beschuetzerisch")
	private boolean beschuetzerisch;

	@Column(name = "bestuendig")
	private boolean bestuendig;

	@Column(name = "beweglich")
	private boolean beweglich;

	// @Column(name="bitter")
	// private boolean bitter;
	// das ist sehr schwierig...
	// butter schmierig

	@Column(name = "bodenstuendig")
	private boolean bodenstuendig;

	@Column(name = "brav")
	private boolean brav;

	@Column(name = "bruederlich")
	private boolean bruederlich;

	@Column(name = "buerokratisch")
	private boolean buerokratisch;

	@Column(name = "burschikos")
	private boolean burschikos;

	// C
	@Column(name = "chaotisch")
	private boolean chaotisch;

	@Column(name = "charakterstark")
	private boolean charakterstark;

	@Column(name = "charismatisch")
	private boolean charismatisch;

	@Column(name = "charmant")
	private boolean charmant;

	@Column(name = "clever")
	private boolean clever;

	@Column(name = "couragiert")
	private boolean couragiert;

	// D

	@Column(name = "damenhaft")
	private boolean damenhaft;

	@Column(name = "dankbar")
	private boolean dankbar;

	@Column(name = "defensiv")
	private boolean defensiv;

	@Column(name = "detailverliebt")
	private boolean detailverliebt;

	@Column(name = "diplomatisch")
	private boolean diplomatisch;

	@Column(name = "direkt")
	private boolean direkt;

	@Column(name = "diskret")
	private boolean diskret;

	@Column(name = "diskussionsfreudig")
	private boolean diskussionsfreudig;

	@Column(name = "diszipliniert")
	private boolean diszipliniert;

	@Column(name = "durchsetzungsstark")
	private boolean durchsetzungsstark;

	@Column(name = "dusselig")
	private boolean dusselig;

	@Column(name = "dynamisch")
	private boolean dynamisch;

	// E

	@Column(name = "effizient")
	private boolean effizient;

	@Column(name = "ehrenhaft")
	private boolean ehrenhaft;

	@Column(name = "ehrfuerchtig")
	private boolean ehrfuerchtig;

	@Column(name = "ehrgeizig")
	private boolean ehrgeizig;

	@Column(name = "ehrlich")
	private boolean ehrlich;

	@Column(name = "eifrig")
	private boolean eifrig;

	@Column(name = "eigenbestimmt")
	private boolean eigenbestimmt;

	@Column(name = "eigenstuendig")
	private boolean eigenstuendig;

	@Column(name = "einfach")
	private boolean einfach;

	@Column(name = "einfallsreich")
	private boolean einfallsreich;

	@Column(name = "einfuehlsam")
	private boolean einfuehlsam;

	@Column(name = "einzelguengerisch")
	private boolean einzelguengerisch;

	@Column(name = "elegant")
	private boolean elegant;

	@Column(name = "emotional")
	private boolean emotional;

	@Column(name = "emotionslos")
	private boolean emotionslos;

	@Column(name = "empathisch")
	private boolean empathisch;

	@Column(name = "engagiert")
	private boolean engagiert;

	@Column(name = "enthaltsam")
	private boolean enthaltsam;

	@Column(name = "enthusiastisch")
	private boolean enthusiastisch;

	@Column(name = "erfinderisch")
	private boolean erfinderisch;

	@Column(name = "erfolgreich")
	private boolean erfolgreich;

	@Column(name = "erfolgsorientiert")
	private boolean erfolgsorientiert;

	@Column(name = "ernst")
	private boolean ernst;

	// @Column(name="ernsthaft")
	// private boolean ernsthaft;
	// ernsthaft jetzt?

	// F

	@Column(name = "fantasievoll")
	private boolean fantasievoll;

	@Column(name = "feinfuehlig")
	private boolean feinfuehlig;

	@Column(name = "feminin")
	private boolean feminin;

	@Column(name = "feministisch")
	private boolean feministisch;

	@Column(name = "feurig")
	private boolean feurig;

	@Column(name = "fleiueig")
	private boolean fleiueig;

	@Column(name = "flexibel")
	private boolean flexibel;

	@Column(name = "freiheitsliebend")
	private boolean freiheitsliebend;

	@Column(name = "freundlich")
	private boolean freundlich;

	@Column(name = "friedliebend")
	private boolean friedliebend;

	// G

	@Column(name = "gastfreundlich")
	private boolean gastfreundlich;

	@Column(name = "gebildet")
	private boolean gebildet;

	@Column(name = "geduldig")
	private boolean geduldig;
	@Column(name = "gefuehlvoll")
	private boolean gefuehlvoll;
	@Column(name = "genau")
	private boolean genau;

	@Column(name = "genauigkeitsliebend")
	private boolean genauigkeitsliebend;

	@Column(name = "genuegsam")
	private boolean genuegsam;

	@Column(name = "gerechtigkeitsliebend")
	private boolean gerechtigkeitsliebend;

	@Column(name = "gescheit")
	private boolean gescheit;

	@Column(name = "geschickt")
	private boolean geschickt;

	@Column(name = "gesellig")
	private boolean gesellig;

	@Column(name = "gespruechig")
	private boolean gespruechig;

	@Column(name = "gesundheitsbewusst")
	private boolean gesundheitsbewusst;

	@Column(name = "gewissenhaft")
	private boolean gewissenhaft;

	@Column(name = "glaubensstark")
	private boolean glaubensstark;

	@Column(name = "gruendlich")
	private boolean gruendlich;

	@Column(name = "guetig")
	private boolean guetig;

	@Column(name = "gutherzig")
	private boolean gutherzig;

	// H

	@Column(name = "harmoniebeduerftig")
	private boolean harmoniebeduerftig;

	@Column(name = "hartnueckig")
	private boolean hartnueckig;

	@Column(name = "hilfsbereit")
	private boolean hilfsbereit;

	@Column(name = "hingebungsvoll")
	private boolean hingebungsvoll;

	@Column(name = "hochbegabt")
	private boolean hochbegabt;

	@Column(name = "hueflich")
	private boolean hueflich;

	@Column(name = "humorvoll")
	private boolean humorvoll;

	// I

	@Column(name = "idealistisch")
	private boolean idealistisch;

	@Column(name = "ideenreich")
	private boolean ideenreich;

	@Column(name = "initiativ")
	private boolean initiativ;

	@Column(name = "intelligent")
	private boolean intelligent;

	@Column(name = "interessiert")
	private boolean interessiert;

	@Column(name = "introvertiert")
	private boolean introvertiert;

	// J
	@Column(name = "jugendlich")
	private boolean jugendlich;

	// K
	@Column(name = "kuempferisch")
	private boolean kuempferisch;

	@Column(name = "kinderlieb")
	private boolean kinderlieb;

	@Column(name = "kindisch")
	private boolean kindisch;

	@Column(name = "kindlich")
	private boolean kindlich;

	@Column(name = "kompromissbereit")
	private boolean kompromissbereit;

	@Column(name = "konfliktfreudig")
	private boolean konfliktfreudig;

	@Column(name = "konfliktscheu")
	private boolean konfliktscheu;

	@Column(name = "kontaktfreudig")
	private boolean kontaktfreudig;

	// @Column(name="korrekt")
	// private boolean korrekt;
	// bist korrekt brudi

	@Column(name = "kreativ")
	private boolean kreativ;

	@Column(name = "kritikfuehig")
	private boolean kritikfuehig;

	@Column(name = "kuenstlerisch")
	private boolean kuenstlerisch;

	@Column(name = "kultiviert")
	private boolean kultiviert;

	@Column(name = "kumpelhaft")
	private boolean kumpelhaft;

	@Column(name = "kurios")
	private boolean kurios;

	// L

	@Column(name = "lebhaft")
	private boolean lebhaft;

	@Column(name = "leidenschaftlich")
	private boolean leidenschaftlich;

	@Column(name = "lernbereit")
	private boolean lernbereit;

	@Column(name = "liebevoll")
	private boolean liebevoll;

	@Column(name = "lustig")
	private boolean lustig;

	@Column(name = "lustvoll")
	private boolean lustvoll;

	// M

	@Column(name = "menschenfreundlich")
	private boolean menschenfreundlich;

	@Column(name = "mitfuehlend")
	private boolean mitfuehlend;

	@Column(name = "modebewusst")
	private boolean modebewusst;

	@Column(name = "muetterlich")
	private boolean muetterlich;

	@Column(name = "musikalisch")
	private boolean musikalisch;

	// N

	@Column(name = "nachdenklich")
	private boolean nachdenklich;

	@Column(name = "nuehesuchend")
	private boolean nuehesuchend;

	@Column(name = "naturverbunden")
	private boolean naturverbunden;

	@Column(name = "neugierig")
	private boolean neugierig;

	@Column(name = "neutral")
	private boolean neutral;

	// O

	@Column(name = "objektiv")
	private boolean objektiv;

	@Column(name = "offen")
	private boolean offen;

	@Column(name = "ordentlich")
	private boolean ordentlich;

	@Column(name = "ordnungsliebend")
	private boolean ordnungsliebend;

	// P

	// @Column(name="panisch")
	// private boolean panisch;
	// paaaniiii

	@Column(name = "perfektionistisch")
	private boolean perfektionistisch;

	@Column(name = "pflichtbewusst")
	private boolean pflichtbewusst;

	@Column(name = "phantasievoll")
	private boolean phantasievoll;

	@Column(name = "planend")
	private boolean planend;

	@Column(name = "problemluesend")
	private boolean problemluesend;

	// Q
	@Column(name = "querdenkend")
	private boolean querdenkend;

	@Column(name = "quirlig")
	private boolean quirlig;

	// R
	@Column(name = "rational")
	private boolean rational;

	@Column(name = "redselig")
	private boolean redselig;

	@Column(name = "reiselustig")
	private boolean reiselustig;

	@Column(name = "religiues")
	private boolean religiues;

	@Column(name = "respektvoll")
	private boolean respektvoll;

	@Column(name = "romantisch")
	private boolean romantisch;

	@Column(name = "ruecksichtsvoll")
	private boolean ruecksichtsvoll;

	@Column(name = "ruhig")
	private boolean ruhig;

	// S

	@Column(name="sachlich")
	private boolean sachlich;

	@Column(name="schuechtern")
	private boolean schuechtern;

	@Column(name="selbstkritisch")
	private boolean selbstkritisch;

	@Column(name="selbstreflektierend")
	private boolean selbstreflektierend;

	@Column(name="sensibel")
	private boolean sensibel;

	@Column(name="sparsam")
	private boolean sparsam;

	@Column(name="spirituell")
	private boolean spirituell;

	@Column(name="spontan")
	private boolean spontan;

	@Column(name="sportlich")
	private boolean sportlich;

	@Column(name="sprachbegabt")
	private boolean sprachbegabt;

	@Column(name="strategisch")
	private boolean strategisch;

	@Column(name="streng")
	private boolean streng;

	// T

	@Column(name="teamfuehig")
	private boolean teamfuehig;

	@Column(name="temperamentvoll")
	private boolean temperamentvoll;

	@Column(name="tiefgruendig")
	private boolean tiefgruendig;

	@Column(name="tierlieb")
	private boolean tierlieb;

	@Column(name="tolerant")
	private boolean tolerant;

	@Column(name="treuherzig")
	private boolean treuherzig;

	@Column(name="tuechtig")
	private boolean tuechtig;


	// U
	
	//@Column(name="unterhopft")
	//private boolean unterhopft;
	//zu wenig n hopfi gsehn?
	

	@Column(name="unternehmungsfreudig")
	private boolean unternehmungsfreudig;

	@Column(name="unternehmungslustig")
	private boolean unternehmungslustig;

	@Column(name="unterstuetzend")
	private boolean unterstuetzend;


	// V
	
	@Column(name="vueterlich")
	private boolean vueterlich;

	@Column(name="verantwortungsvoll")
	private boolean verantwortungsvoll;

	@Column(name="verluesslich")
	private boolean verluesslich;

	@Column(name="verstuendnisvoll")
	private boolean verstuendnisvoll;

	@Column(name="vertrauenswuerdig")
	private boolean vertrauenswuerdig;

	@Column(name="vielschichtig")
	private boolean vielschichtig;

	// W

	@Column(name="weltoffen")
	private boolean weltoffen;

	@Column(name="werteorientiert")
	private boolean werteorientiert;

	@Column(name="willensstark")
	private boolean willensstark;

	@Column(name="wissbegierig")
	private boolean wissbegierig;

	@Column(name="wortgewandt")
	private boolean wortgewandt;

	@Column(name="wortkarg")
	private boolean wortkarg;


	// Z

	@Column(name="zielstrebig")
	private boolean zielstrebig;

	@Column(name="zukunftsorientiert")
	private boolean zukunftsorientiert;

	@Column(name="zuverluessig")
	private boolean zuverluessig;

	@Column(name="zuversichtlich")
	private boolean zuversichtlich;

	@Column(name="zuvorkommend")
	private boolean zuvorkommend;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAbenteuerlustig() {
		return abenteuerlustig;
	}

	public void setAbenteuerlustig(boolean abenteuerlustig) {
		this.abenteuerlustig = abenteuerlustig;
	}

	public boolean isAberglueubisch() {
		return aberglueubisch;
	}

	public void setAberglueubisch(boolean aberglueubisch) {
		this.aberglueubisch = aberglueubisch;
	}

	public boolean isAbsprachefuehig() {
		return absprachefuehig;
	}

	public void setAbsprachefuehig(boolean absprachefuehig) {
		this.absprachefuehig = absprachefuehig;
	}

	public boolean isAchtsam() {
		return achtsam;
	}

	public void setAchtsam(boolean achtsam) {
		this.achtsam = achtsam;
	}

	public boolean isAdrett() {
		return adrett;
	}

	public void setAdrett(boolean adrett) {
		this.adrett = adrett;
	}

	public boolean isAffektiert() {
		return affektiert;
	}

	public void setAffektiert(boolean affektiert) {
		this.affektiert = affektiert;
	}

	public boolean isAgil() {
		return agil;
	}

	public void setAgil(boolean agil) {
		this.agil = agil;
	}

	public boolean isAkkurat() {
		return akkurat;
	}

	public void setAkkurat(boolean akkurat) {
		this.akkurat = akkurat;
	}

	public boolean isAkribisch() {
		return akribisch;
	}

	public void setAkribisch(boolean akribisch) {
		this.akribisch = akribisch;
	}

	public boolean isAktiv() {
		return aktiv;
	}

	public void setAktiv(boolean aktiv) {
		this.aktiv = aktiv;
	}

	public boolean isAlbern() {
		return albern;
	}

	public void setAlbern(boolean albern) {
		this.albern = albern;
	}

	public boolean isAltmodisch() {
		return altmodisch;
	}

	public void setAltmodisch(boolean altmodisch) {
		this.altmodisch = altmodisch;
	}

	public boolean isAmbitioniert() {
		return ambitioniert;
	}

	public void setAmbitioniert(boolean ambitioniert) {
		this.ambitioniert = ambitioniert;
	}

	public boolean isAmuesant() {
		return amuesant;
	}

	public void setAmuesant(boolean amuesant) {
		this.amuesant = amuesant;
	}

	public boolean isAnalytisch() {
		return analytisch;
	}

	public void setAnalytisch(boolean analytisch) {
		this.analytisch = analytisch;
	}

	public boolean isAnders() {
		return anders;
	}

	public void setAnders(boolean anders) {
		this.anders = anders;
	}

	public boolean isAngepasst() {
		return angepasst;
	}

	public void setAngepasst(boolean angepasst) {
		this.angepasst = angepasst;
	}

	public boolean isAngespannt() {
		return angespannt;
	}

	public void setAngespannt(boolean angespannt) {
		this.angespannt = angespannt;
	}

	public boolean isAngriffslustig() {
		return angriffslustig;
	}

	public void setAngriffslustig(boolean angriffslustig) {
		this.angriffslustig = angriffslustig;
	}

	public boolean isAngstfrei() {
		return angstfrei;
	}

	public void setAngstfrei(boolean angstfrei) {
		this.angstfrei = angstfrei;
	}

	public boolean isAnmutig() {
		return anmutig;
	}

	public void setAnmutig(boolean anmutig) {
		this.anmutig = anmutig;
	}

	public boolean isAnnehmend() {
		return annehmend;
	}

	public void setAnnehmend(boolean annehmend) {
		this.annehmend = annehmend;
	}

	public boolean isAnpackend() {
		return anpackend;
	}

	public void setAnpackend(boolean anpackend) {
		this.anpackend = anpackend;
	}

	public boolean isAnpassungsbereit() {
		return anpassungsbereit;
	}

	public void setAnpassungsbereit(boolean anpassungsbereit) {
		this.anpassungsbereit = anpassungsbereit;
	}

	public boolean isAnpassungsfuehig() {
		return anpassungsfuehig;
	}

	public void setAnpassungsfuehig(boolean anpassungsfuehig) {
		this.anpassungsfuehig = anpassungsfuehig;
	}

	public boolean isAnspruchslos() {
		return anspruchslos;
	}

	public void setAnspruchslos(boolean anspruchslos) {
		this.anspruchslos = anspruchslos;
	}

	public boolean isAnspruchsvoll() {
		return anspruchsvoll;
	}

	public void setAnspruchsvoll(boolean anspruchsvoll) {
		this.anspruchsvoll = anspruchsvoll;
	}

	public boolean isAnstuendig() {
		return anstuendig;
	}

	public void setAnstuendig(boolean anstuendig) {
		this.anstuendig = anstuendig;
	}

	public boolean isAnstrengend() {
		return anstrengend;
	}

	public void setAnstrengend(boolean anstrengend) {
		this.anstrengend = anstrengend;
	}

	public boolean isArbeitsam() {
		return arbeitsam;
	}

	public void setArbeitsam(boolean arbeitsam) {
		this.arbeitsam = arbeitsam;
	}

	public boolean isAthletisch() {
		return athletisch;
	}

	public void setAthletisch(boolean athletisch) {
		this.athletisch = athletisch;
	}

	public boolean isAufbauend() {
		return aufbauend;
	}

	public void setAufbauend(boolean aufbauend) {
		this.aufbauend = aufbauend;
	}

	public boolean isAufgeschlossen() {
		return aufgeschlossen;
	}

	public void setAufgeschlossen(boolean aufgeschlossen) {
		this.aufgeschlossen = aufgeschlossen;
	}

	public boolean isAufgeweckt() {
		return aufgeweckt;
	}

	public void setAufgeweckt(boolean aufgeweckt) {
		this.aufgeweckt = aufgeweckt;
	}

	public boolean isAufmerksam() {
		return aufmerksam;
	}

	public void setAufmerksam(boolean aufmerksam) {
		this.aufmerksam = aufmerksam;
	}

	public boolean isAufmunternd() {
		return aufmunternd;
	}

	public void setAufmunternd(boolean aufmunternd) {
		this.aufmunternd = aufmunternd;
	}

	public boolean isAufopferungsvoll() {
		return aufopferungsvoll;
	}

	public void setAufopferungsvoll(boolean aufopferungsvoll) {
		this.aufopferungsvoll = aufopferungsvoll;
	}

	public boolean isAufregend() {
		return aufregend;
	}

	public void setAufregend(boolean aufregend) {
		this.aufregend = aufregend;
	}

	public boolean isAufrichtig() {
		return aufrichtig;
	}

	public void setAufrichtig(boolean aufrichtig) {
		this.aufrichtig = aufrichtig;
	}

	public boolean isAusdauernd() {
		return ausdauernd;
	}

	public void setAusdauernd(boolean ausdauernd) {
		this.ausdauernd = ausdauernd;
	}

	public boolean isAusdrucksstark() {
		return ausdrucksstark;
	}

	public void setAusdrucksstark(boolean ausdrucksstark) {
		this.ausdrucksstark = ausdrucksstark;
	}

	public boolean isAusluenderfreundlich() {
		return ausluenderfreundlich;
	}

	public void setAusluenderfreundlich(boolean ausluenderfreundlich) {
		this.ausluenderfreundlich = ausluenderfreundlich;
	}

	public boolean isAuthentisch() {
		return authentisch;
	}

	public void setAuthentisch(boolean authentisch) {
		this.authentisch = authentisch;
	}

	public boolean isAutonom() {
		return autonom;
	}

	public void setAutonom(boolean autonom) {
		this.autonom = autonom;
	}

	public boolean isAutorituer() {
		return autorituer;
	}

	public void setAutorituer(boolean autorituer) {
		this.autorituer = autorituer;
	}

	public boolean isBedacht() {
		return bedacht;
	}

	public void setBedacht(boolean bedacht) {
		this.bedacht = bedacht;
	}

	public boolean isBedenkenlos() {
		return bedenkenlos;
	}

	public void setBedenkenlos(boolean bedenkenlos) {
		this.bedenkenlos = bedenkenlos;
	}

	public boolean isBegabt() {
		return begabt;
	}

	public void setBegabt(boolean begabt) {
		this.begabt = begabt;
	}

	public boolean isBegeisterungsfuehig() {
		return begeisterungsfuehig;
	}

	public void setBegeisterungsfuehig(boolean begeisterungsfuehig) {
		this.begeisterungsfuehig = begeisterungsfuehig;
	}

	public boolean isBegnuegsam() {
		return begnuegsam;
	}

	public void setBegnuegsam(boolean begnuegsam) {
		this.begnuegsam = begnuegsam;
	}

	public boolean isBeherzt() {
		return beherzt;
	}

	public void setBeherzt(boolean beherzt) {
		this.beherzt = beherzt;
	}

	public boolean isBehutsam() {
		return behutsam;
	}

	public void setBehutsam(boolean behutsam) {
		this.behutsam = behutsam;
	}

	public boolean isBelastbar() {
		return belastbar;
	}

	public void setBelastbar(boolean belastbar) {
		this.belastbar = belastbar;
	}

	public boolean isBelesen() {
		return belesen;
	}

	public void setBelesen(boolean belesen) {
		this.belesen = belesen;
	}

	public boolean isBeliebt() {
		return beliebt;
	}

	public void setBeliebt(boolean beliebt) {
		this.beliebt = beliebt;
	}

	public boolean isBemutternd() {
		return bemutternd;
	}

	public void setBemutternd(boolean bemutternd) {
		this.bemutternd = bemutternd;
	}

	public boolean isBescheiden() {
		return bescheiden;
	}

	public void setBescheiden(boolean bescheiden) {
		this.bescheiden = bescheiden;
	}

	public boolean isBeschuetzerisch() {
		return beschuetzerisch;
	}

	public void setBeschuetzerisch(boolean beschuetzerisch) {
		this.beschuetzerisch = beschuetzerisch;
	}

	public boolean isBestuendig() {
		return bestuendig;
	}

	public void setBestuendig(boolean bestuendig) {
		this.bestuendig = bestuendig;
	}

	public boolean isBeweglich() {
		return beweglich;
	}

	public void setBeweglich(boolean beweglich) {
		this.beweglich = beweglich;
	}

	public boolean isBodenstuendig() {
		return bodenstuendig;
	}

	public void setBodenstuendig(boolean bodenstuendig) {
		this.bodenstuendig = bodenstuendig;
	}

	public boolean isBrav() {
		return brav;
	}

	public void setBrav(boolean brav) {
		this.brav = brav;
	}

	public boolean isBruederlich() {
		return bruederlich;
	}

	public void setBruederlich(boolean bruederlich) {
		this.bruederlich = bruederlich;
	}

	public boolean isBuerokratisch() {
		return buerokratisch;
	}

	public void setBuerokratisch(boolean buerokratisch) {
		this.buerokratisch = buerokratisch;
	}

	public boolean isBurschikos() {
		return burschikos;
	}

	public void setBurschikos(boolean burschikos) {
		this.burschikos = burschikos;
	}

	public boolean isChaotisch() {
		return chaotisch;
	}

	public void setChaotisch(boolean chaotisch) {
		this.chaotisch = chaotisch;
	}

	public boolean isCharakterstark() {
		return charakterstark;
	}

	public void setCharakterstark(boolean charakterstark) {
		this.charakterstark = charakterstark;
	}

	public boolean isCharismatisch() {
		return charismatisch;
	}

	public void setCharismatisch(boolean charismatisch) {
		this.charismatisch = charismatisch;
	}

	public boolean isCharmant() {
		return charmant;
	}

	public void setCharmant(boolean charmant) {
		this.charmant = charmant;
	}

	public boolean isClever() {
		return clever;
	}

	public void setClever(boolean clever) {
		this.clever = clever;
	}

	public boolean isCouragiert() {
		return couragiert;
	}

	public void setCouragiert(boolean couragiert) {
		this.couragiert = couragiert;
	}

	public boolean isDamenhaft() {
		return damenhaft;
	}

	public void setDamenhaft(boolean damenhaft) {
		this.damenhaft = damenhaft;
	}

	public boolean isDankbar() {
		return dankbar;
	}

	public void setDankbar(boolean dankbar) {
		this.dankbar = dankbar;
	}

	public boolean isDefensiv() {
		return defensiv;
	}

	public void setDefensiv(boolean defensiv) {
		this.defensiv = defensiv;
	}

	public boolean isDetailverliebt() {
		return detailverliebt;
	}

	public void setDetailverliebt(boolean detailverliebt) {
		this.detailverliebt = detailverliebt;
	}

	public boolean isDiplomatisch() {
		return diplomatisch;
	}

	public void setDiplomatisch(boolean diplomatisch) {
		this.diplomatisch = diplomatisch;
	}

	public boolean isDirekt() {
		return direkt;
	}

	public void setDirekt(boolean direkt) {
		this.direkt = direkt;
	}

	public boolean isDiskret() {
		return diskret;
	}

	public void setDiskret(boolean diskret) {
		this.diskret = diskret;
	}

	public boolean isDiskussionsfreudig() {
		return diskussionsfreudig;
	}

	public void setDiskussionsfreudig(boolean diskussionsfreudig) {
		this.diskussionsfreudig = diskussionsfreudig;
	}

	public boolean isDiszipliniert() {
		return diszipliniert;
	}

	public void setDiszipliniert(boolean diszipliniert) {
		this.diszipliniert = diszipliniert;
	}

	public boolean isDurchsetzungsstark() {
		return durchsetzungsstark;
	}

	public void setDurchsetzungsstark(boolean durchsetzungsstark) {
		this.durchsetzungsstark = durchsetzungsstark;
	}

	public boolean isDusselig() {
		return dusselig;
	}

	public void setDusselig(boolean dusselig) {
		this.dusselig = dusselig;
	}

	public boolean isDynamisch() {
		return dynamisch;
	}

	public void setDynamisch(boolean dynamisch) {
		this.dynamisch = dynamisch;
	}

	public boolean isEffizient() {
		return effizient;
	}

	public void setEffizient(boolean effizient) {
		this.effizient = effizient;
	}

	public boolean isEhrenhaft() {
		return ehrenhaft;
	}

	public void setEhrenhaft(boolean ehrenhaft) {
		this.ehrenhaft = ehrenhaft;
	}

	public boolean isEhrfuerchtig() {
		return ehrfuerchtig;
	}

	public void setEhrfuerchtig(boolean ehrfuerchtig) {
		this.ehrfuerchtig = ehrfuerchtig;
	}

	public boolean isEhrgeizig() {
		return ehrgeizig;
	}

	public void setEhrgeizig(boolean ehrgeizig) {
		this.ehrgeizig = ehrgeizig;
	}

	public boolean isEhrlich() {
		return ehrlich;
	}

	public void setEhrlich(boolean ehrlich) {
		this.ehrlich = ehrlich;
	}

	public boolean isEifrig() {
		return eifrig;
	}

	public void setEifrig(boolean eifrig) {
		this.eifrig = eifrig;
	}

	public boolean isEigenbestimmt() {
		return eigenbestimmt;
	}

	public void setEigenbestimmt(boolean eigenbestimmt) {
		this.eigenbestimmt = eigenbestimmt;
	}

	public boolean isEigenstuendig() {
		return eigenstuendig;
	}

	public void setEigenstuendig(boolean eigenstuendig) {
		this.eigenstuendig = eigenstuendig;
	}

	public boolean isEinfach() {
		return einfach;
	}

	public void setEinfach(boolean einfach) {
		this.einfach = einfach;
	}

	public boolean isEinfallsreich() {
		return einfallsreich;
	}

	public void setEinfallsreich(boolean einfallsreich) {
		this.einfallsreich = einfallsreich;
	}

	public boolean isEinfuehlsam() {
		return einfuehlsam;
	}

	public void setEinfuehlsam(boolean einfuehlsam) {
		this.einfuehlsam = einfuehlsam;
	}

	public boolean isEinzelguengerisch() {
		return einzelguengerisch;
	}

	public void setEinzelguengerisch(boolean einzelguengerisch) {
		this.einzelguengerisch = einzelguengerisch;
	}

	public boolean isElegant() {
		return elegant;
	}

	public void setElegant(boolean elegant) {
		this.elegant = elegant;
	}

	public boolean isEmotional() {
		return emotional;
	}

	public void setEmotional(boolean emotional) {
		this.emotional = emotional;
	}

	public boolean isEmotionslos() {
		return emotionslos;
	}

	public void setEmotionslos(boolean emotionslos) {
		this.emotionslos = emotionslos;
	}

	public boolean isEmpathisch() {
		return empathisch;
	}

	public void setEmpathisch(boolean empathisch) {
		this.empathisch = empathisch;
	}

	public boolean isEngagiert() {
		return engagiert;
	}

	public void setEngagiert(boolean engagiert) {
		this.engagiert = engagiert;
	}

	public boolean isEnthaltsam() {
		return enthaltsam;
	}

	public void setEnthaltsam(boolean enthaltsam) {
		this.enthaltsam = enthaltsam;
	}

	public boolean isEnthusiastisch() {
		return enthusiastisch;
	}

	public void setEnthusiastisch(boolean enthusiastisch) {
		this.enthusiastisch = enthusiastisch;
	}

	public boolean isErfinderisch() {
		return erfinderisch;
	}

	public void setErfinderisch(boolean erfinderisch) {
		this.erfinderisch = erfinderisch;
	}

	public boolean isErfolgreich() {
		return erfolgreich;
	}

	public void setErfolgreich(boolean erfolgreich) {
		this.erfolgreich = erfolgreich;
	}

	public boolean isErfolgsorientiert() {
		return erfolgsorientiert;
	}

	public void setErfolgsorientiert(boolean erfolgsorientiert) {
		this.erfolgsorientiert = erfolgsorientiert;
	}

	public boolean isErnst() {
		return ernst;
	}

	public void setErnst(boolean ernst) {
		this.ernst = ernst;
	}

	public boolean isFantasievoll() {
		return fantasievoll;
	}

	public void setFantasievoll(boolean fantasievoll) {
		this.fantasievoll = fantasievoll;
	}

	public boolean isFeinfuehlig() {
		return feinfuehlig;
	}

	public void setFeinfuehlig(boolean feinfuehlig) {
		this.feinfuehlig = feinfuehlig;
	}

	public boolean isFeminin() {
		return feminin;
	}

	public void setFeminin(boolean feminin) {
		this.feminin = feminin;
	}

	public boolean isFeministisch() {
		return feministisch;
	}

	public void setFeministisch(boolean feministisch) {
		this.feministisch = feministisch;
	}

	public boolean isFeurig() {
		return feurig;
	}

	public void setFeurig(boolean feurig) {
		this.feurig = feurig;
	}

	public boolean isFleiueig() {
		return fleiueig;
	}

	public void setFleiueig(boolean fleiueig) {
		this.fleiueig = fleiueig;
	}

	public boolean isFlexibel() {
		return flexibel;
	}

	public void setFlexibel(boolean flexibel) {
		this.flexibel = flexibel;
	}

	public boolean isFreiheitsliebend() {
		return freiheitsliebend;
	}

	public void setFreiheitsliebend(boolean freiheitsliebend) {
		this.freiheitsliebend = freiheitsliebend;
	}

	public boolean isFreundlich() {
		return freundlich;
	}

	public void setFreundlich(boolean freundlich) {
		this.freundlich = freundlich;
	}

	public boolean isFriedliebend() {
		return friedliebend;
	}

	public void setFriedliebend(boolean friedliebend) {
		this.friedliebend = friedliebend;
	}

	public boolean isGastfreundlich() {
		return gastfreundlich;
	}

	public void setGastfreundlich(boolean gastfreundlich) {
		this.gastfreundlich = gastfreundlich;
	}

	public boolean isGebildet() {
		return gebildet;
	}

	public void setGebildet(boolean gebildet) {
		this.gebildet = gebildet;
	}

	public boolean isGeduldig() {
		return geduldig;
	}

	public void setGeduldig(boolean geduldig) {
		this.geduldig = geduldig;
	}

	public boolean isGefuehlvoll() {
		return gefuehlvoll;
	}

	public void setGefuehlvoll(boolean gefuehlvoll) {
		this.gefuehlvoll = gefuehlvoll;
	}

	public boolean isGenau() {
		return genau;
	}

	public void setGenau(boolean genau) {
		this.genau = genau;
	}

	public boolean isGenauigkeitsliebend() {
		return genauigkeitsliebend;
	}

	public void setGenauigkeitsliebend(boolean genauigkeitsliebend) {
		this.genauigkeitsliebend = genauigkeitsliebend;
	}

	public boolean isGenuegsam() {
		return genuegsam;
	}

	public void setGenuegsam(boolean genuegsam) {
		this.genuegsam = genuegsam;
	}

	public boolean isGerechtigkeitsliebend() {
		return gerechtigkeitsliebend;
	}

	public void setGerechtigkeitsliebend(boolean gerechtigkeitsliebend) {
		this.gerechtigkeitsliebend = gerechtigkeitsliebend;
	}

	public boolean isGescheit() {
		return gescheit;
	}

	public void setGescheit(boolean gescheit) {
		this.gescheit = gescheit;
	}

	public boolean isGeschickt() {
		return geschickt;
	}

	public void setGeschickt(boolean geschickt) {
		this.geschickt = geschickt;
	}

	public boolean isGesellig() {
		return gesellig;
	}

	public void setGesellig(boolean gesellig) {
		this.gesellig = gesellig;
	}

	public boolean isGespruechig() {
		return gespruechig;
	}

	public void setGespruechig(boolean gespruechig) {
		this.gespruechig = gespruechig;
	}

	public boolean isGesundheitsbewusst() {
		return gesundheitsbewusst;
	}

	public void setGesundheitsbewusst(boolean gesundheitsbewusst) {
		this.gesundheitsbewusst = gesundheitsbewusst;
	}

	public boolean isGewissenhaft() {
		return gewissenhaft;
	}

	public void setGewissenhaft(boolean gewissenhaft) {
		this.gewissenhaft = gewissenhaft;
	}

	public boolean isGlaubensstark() {
		return glaubensstark;
	}

	public void setGlaubensstark(boolean glaubensstark) {
		this.glaubensstark = glaubensstark;
	}

	public boolean isGruendlich() {
		return gruendlich;
	}

	public void setGruendlich(boolean gruendlich) {
		this.gruendlich = gruendlich;
	}

	public boolean isGuetig() {
		return guetig;
	}

	public void setGuetig(boolean guetig) {
		this.guetig = guetig;
	}

	public boolean isGutherzig() {
		return gutherzig;
	}

	public void setGutherzig(boolean gutherzig) {
		this.gutherzig = gutherzig;
	}

	public boolean isHarmoniebeduerftig() {
		return harmoniebeduerftig;
	}

	public void setHarmoniebeduerftig(boolean harmoniebeduerftig) {
		this.harmoniebeduerftig = harmoniebeduerftig;
	}

	public boolean isHartnueckig() {
		return hartnueckig;
	}

	public void setHartnueckig(boolean hartnueckig) {
		this.hartnueckig = hartnueckig;
	}

	public boolean isHilfsbereit() {
		return hilfsbereit;
	}

	public void setHilfsbereit(boolean hilfsbereit) {
		this.hilfsbereit = hilfsbereit;
	}

	public boolean isHingebungsvoll() {
		return hingebungsvoll;
	}

	public void setHingebungsvoll(boolean hingebungsvoll) {
		this.hingebungsvoll = hingebungsvoll;
	}

	public boolean isHochbegabt() {
		return hochbegabt;
	}

	public void setHochbegabt(boolean hochbegabt) {
		this.hochbegabt = hochbegabt;
	}

	public boolean isHueflich() {
		return hueflich;
	}

	public void setHueflich(boolean hueflich) {
		this.hueflich = hueflich;
	}

	public boolean isHumorvoll() {
		return humorvoll;
	}

	public void setHumorvoll(boolean humorvoll) {
		this.humorvoll = humorvoll;
	}

	public boolean isIdealistisch() {
		return idealistisch;
	}

	public void setIdealistisch(boolean idealistisch) {
		this.idealistisch = idealistisch;
	}

	public boolean isIdeenreich() {
		return ideenreich;
	}

	public void setIdeenreich(boolean ideenreich) {
		this.ideenreich = ideenreich;
	}

	public boolean isInitiativ() {
		return initiativ;
	}

	public void setInitiativ(boolean initiativ) {
		this.initiativ = initiativ;
	}

	public boolean isIntelligent() {
		return intelligent;
	}

	public void setIntelligent(boolean intelligent) {
		this.intelligent = intelligent;
	}

	public boolean isInteressiert() {
		return interessiert;
	}

	public void setInteressiert(boolean interessiert) {
		this.interessiert = interessiert;
	}

	public boolean isIntrovertiert() {
		return introvertiert;
	}

	public void setIntrovertiert(boolean introvertiert) {
		this.introvertiert = introvertiert;
	}

	public boolean isJugendlich() {
		return jugendlich;
	}

	public void setJugendlich(boolean jugendlich) {
		this.jugendlich = jugendlich;
	}

	public boolean isKuempferisch() {
		return kuempferisch;
	}

	public void setKuempferisch(boolean kuempferisch) {
		this.kuempferisch = kuempferisch;
	}

	public boolean isKinderlieb() {
		return kinderlieb;
	}

	public void setKinderlieb(boolean kinderlieb) {
		this.kinderlieb = kinderlieb;
	}

	public boolean isKindisch() {
		return kindisch;
	}

	public void setKindisch(boolean kindisch) {
		this.kindisch = kindisch;
	}

	public boolean isKindlich() {
		return kindlich;
	}

	public void setKindlich(boolean kindlich) {
		this.kindlich = kindlich;
	}

	public boolean isKompromissbereit() {
		return kompromissbereit;
	}

	public void setKompromissbereit(boolean kompromissbereit) {
		this.kompromissbereit = kompromissbereit;
	}

	public boolean isKonfliktfreudig() {
		return konfliktfreudig;
	}

	public void setKonfliktfreudig(boolean konfliktfreudig) {
		this.konfliktfreudig = konfliktfreudig;
	}

	public boolean isKonfliktscheu() {
		return konfliktscheu;
	}

	public void setKonfliktscheu(boolean konfliktscheu) {
		this.konfliktscheu = konfliktscheu;
	}

	public boolean isKontaktfreudig() {
		return kontaktfreudig;
	}

	public void setKontaktfreudig(boolean kontaktfreudig) {
		this.kontaktfreudig = kontaktfreudig;
	}

	public boolean isKreativ() {
		return kreativ;
	}

	public void setKreativ(boolean kreativ) {
		this.kreativ = kreativ;
	}

	public boolean isKritikfuehig() {
		return kritikfuehig;
	}

	public void setKritikfuehig(boolean kritikfuehig) {
		this.kritikfuehig = kritikfuehig;
	}

	public boolean isKuenstlerisch() {
		return kuenstlerisch;
	}

	public void setKuenstlerisch(boolean kuenstlerisch) {
		this.kuenstlerisch = kuenstlerisch;
	}

	public boolean isKultiviert() {
		return kultiviert;
	}

	public void setKultiviert(boolean kultiviert) {
		this.kultiviert = kultiviert;
	}

	public boolean isKumpelhaft() {
		return kumpelhaft;
	}

	public void setKumpelhaft(boolean kumpelhaft) {
		this.kumpelhaft = kumpelhaft;
	}

	public boolean isKurios() {
		return kurios;
	}

	public void setKurios(boolean kurios) {
		this.kurios = kurios;
	}

	public boolean isLebhaft() {
		return lebhaft;
	}

	public void setLebhaft(boolean lebhaft) {
		this.lebhaft = lebhaft;
	}

	public boolean isLeidenschaftlich() {
		return leidenschaftlich;
	}

	public void setLeidenschaftlich(boolean leidenschaftlich) {
		this.leidenschaftlich = leidenschaftlich;
	}

	public boolean isLernbereit() {
		return lernbereit;
	}

	public void setLernbereit(boolean lernbereit) {
		this.lernbereit = lernbereit;
	}

	public boolean isLiebevoll() {
		return liebevoll;
	}

	public void setLiebevoll(boolean liebevoll) {
		this.liebevoll = liebevoll;
	}

	public boolean isLustig() {
		return lustig;
	}

	public void setLustig(boolean lustig) {
		this.lustig = lustig;
	}

	public boolean isLustvoll() {
		return lustvoll;
	}

	public void setLustvoll(boolean lustvoll) {
		this.lustvoll = lustvoll;
	}

	public boolean isMenschenfreundlich() {
		return menschenfreundlich;
	}

	public void setMenschenfreundlich(boolean menschenfreundlich) {
		this.menschenfreundlich = menschenfreundlich;
	}

	public boolean isMitfuehlend() {
		return mitfuehlend;
	}

	public void setMitfuehlend(boolean mitfuehlend) {
		this.mitfuehlend = mitfuehlend;
	}

	public boolean isModebewusst() {
		return modebewusst;
	}

	public void setModebewusst(boolean modebewusst) {
		this.modebewusst = modebewusst;
	}

	public boolean isMuetterlich() {
		return muetterlich;
	}

	public void setMuetterlich(boolean muetterlich) {
		this.muetterlich = muetterlich;
	}

	public boolean isMusikalisch() {
		return musikalisch;
	}

	public void setMusikalisch(boolean musikalisch) {
		this.musikalisch = musikalisch;
	}

	public boolean isNachdenklich() {
		return nachdenklich;
	}

	public void setNachdenklich(boolean nachdenklich) {
		this.nachdenklich = nachdenklich;
	}

	public boolean isNuehesuchend() {
		return nuehesuchend;
	}

	public void setNuehesuchend(boolean nuehesuchend) {
		this.nuehesuchend = nuehesuchend;
	}

	public boolean isNaturverbunden() {
		return naturverbunden;
	}

	public void setNaturverbunden(boolean naturverbunden) {
		this.naturverbunden = naturverbunden;
	}

	public boolean isNeugierig() {
		return neugierig;
	}

	public void setNeugierig(boolean neugierig) {
		this.neugierig = neugierig;
	}

	public boolean isNeutral() {
		return neutral;
	}

	public void setNeutral(boolean neutral) {
		this.neutral = neutral;
	}

	public boolean isObjektiv() {
		return objektiv;
	}

	public void setObjektiv(boolean objektiv) {
		this.objektiv = objektiv;
	}

	public boolean isOffen() {
		return offen;
	}

	public void setOffen(boolean offen) {
		this.offen = offen;
	}

	public boolean isOrdentlich() {
		return ordentlich;
	}

	public void setOrdentlich(boolean ordentlich) {
		this.ordentlich = ordentlich;
	}

	public boolean isOrdnungsliebend() {
		return ordnungsliebend;
	}

	public void setOrdnungsliebend(boolean ordnungsliebend) {
		this.ordnungsliebend = ordnungsliebend;
	}

	public boolean isPerfektionistisch() {
		return perfektionistisch;
	}

	public void setPerfektionistisch(boolean perfektionistisch) {
		this.perfektionistisch = perfektionistisch;
	}

	public boolean isPflichtbewusst() {
		return pflichtbewusst;
	}

	public void setPflichtbewusst(boolean pflichtbewusst) {
		this.pflichtbewusst = pflichtbewusst;
	}

	public boolean isPhantasievoll() {
		return phantasievoll;
	}

	public void setPhantasievoll(boolean phantasievoll) {
		this.phantasievoll = phantasievoll;
	}

	public boolean isPlanend() {
		return planend;
	}

	public void setPlanend(boolean planend) {
		this.planend = planend;
	}

	public boolean isProblemluesend() {
		return problemluesend;
	}

	public void setProblemluesend(boolean problemluesend) {
		this.problemluesend = problemluesend;
	}

	public boolean isQuerdenkend() {
		return querdenkend;
	}

	public void setQuerdenkend(boolean querdenkend) {
		this.querdenkend = querdenkend;
	}

	public boolean isQuirlig() {
		return quirlig;
	}

	public void setQuirlig(boolean quirlig) {
		this.quirlig = quirlig;
	}

	public boolean isRational() {
		return rational;
	}

	public void setRational(boolean rational) {
		this.rational = rational;
	}

	public boolean isRedselig() {
		return redselig;
	}

	public void setRedselig(boolean redselig) {
		this.redselig = redselig;
	}

	public boolean isReiselustig() {
		return reiselustig;
	}

	public void setReiselustig(boolean reiselustig) {
		this.reiselustig = reiselustig;
	}

	public boolean isReligiues() {
		return religiues;
	}

	public void setReligiues(boolean religiues) {
		this.religiues = religiues;
	}

	public boolean isRespektvoll() {
		return respektvoll;
	}

	public void setRespektvoll(boolean respektvoll) {
		this.respektvoll = respektvoll;
	}

	public boolean isRomantisch() {
		return romantisch;
	}

	public void setRomantisch(boolean romantisch) {
		this.romantisch = romantisch;
	}

	public boolean isRuecksichtsvoll() {
		return ruecksichtsvoll;
	}

	public void setRuecksichtsvoll(boolean ruecksichtsvoll) {
		this.ruecksichtsvoll = ruecksichtsvoll;
	}

	public boolean isRuhig() {
		return ruhig;
	}

	public void setRuhig(boolean ruhig) {
		this.ruhig = ruhig;
	}

	public boolean isSachlich() {
		return sachlich;
	}

	public void setSachlich(boolean sachlich) {
		this.sachlich = sachlich;
	}

	public boolean isSchuechtern() {
		return schuechtern;
	}

	public void setSchuechtern(boolean schuechtern) {
		this.schuechtern = schuechtern;
	}

	public boolean isSelbstkritisch() {
		return selbstkritisch;
	}

	public void setSelbstkritisch(boolean selbstkritisch) {
		this.selbstkritisch = selbstkritisch;
	}

	public boolean isSelbstreflektierend() {
		return selbstreflektierend;
	}

	public void setSelbstreflektierend(boolean selbstreflektierend) {
		this.selbstreflektierend = selbstreflektierend;
	}

	public boolean isSensibel() {
		return sensibel;
	}

	public void setSensibel(boolean sensibel) {
		this.sensibel = sensibel;
	}

	public boolean isSparsam() {
		return sparsam;
	}

	public void setSparsam(boolean sparsam) {
		this.sparsam = sparsam;
	}

	public boolean isSpirituell() {
		return spirituell;
	}

	public void setSpirituell(boolean spirituell) {
		this.spirituell = spirituell;
	}

	public boolean isSpontan() {
		return spontan;
	}

	public void setSpontan(boolean spontan) {
		this.spontan = spontan;
	}

	public boolean isSportlich() {
		return sportlich;
	}

	public void setSportlich(boolean sportlich) {
		this.sportlich = sportlich;
	}

	public boolean isSprachbegabt() {
		return sprachbegabt;
	}

	public void setSprachbegabt(boolean sprachbegabt) {
		this.sprachbegabt = sprachbegabt;
	}

	public boolean isStrategisch() {
		return strategisch;
	}

	public void setStrategisch(boolean strategisch) {
		this.strategisch = strategisch;
	}

	public boolean isStreng() {
		return streng;
	}

	public void setStreng(boolean streng) {
		this.streng = streng;
	}

	public boolean isTeamfuehig() {
		return teamfuehig;
	}

	public void setTeamfuehig(boolean teamfuehig) {
		this.teamfuehig = teamfuehig;
	}

	public boolean isTemperamentvoll() {
		return temperamentvoll;
	}

	public void setTemperamentvoll(boolean temperamentvoll) {
		this.temperamentvoll = temperamentvoll;
	}

	public boolean isTiefgruendig() {
		return tiefgruendig;
	}

	public void setTiefgruendig(boolean tiefgruendig) {
		this.tiefgruendig = tiefgruendig;
	}

	public boolean isTierlieb() {
		return tierlieb;
	}

	public void setTierlieb(boolean tierlieb) {
		this.tierlieb = tierlieb;
	}

	public boolean isTolerant() {
		return tolerant;
	}

	public void setTolerant(boolean tolerant) {
		this.tolerant = tolerant;
	}

	public boolean isTreuherzig() {
		return treuherzig;
	}

	public void setTreuherzig(boolean treuherzig) {
		this.treuherzig = treuherzig;
	}

	public boolean isTuechtig() {
		return tuechtig;
	}

	public void setTuechtig(boolean tuechtig) {
		this.tuechtig = tuechtig;
	}

	public boolean isUnternehmungsfreudig() {
		return unternehmungsfreudig;
	}

	public void setUnternehmungsfreudig(boolean unternehmungsfreudig) {
		this.unternehmungsfreudig = unternehmungsfreudig;
	}

	public boolean isUnternehmungslustig() {
		return unternehmungslustig;
	}

	public void setUnternehmungslustig(boolean unternehmungslustig) {
		this.unternehmungslustig = unternehmungslustig;
	}

	public boolean isUnterstuetzend() {
		return unterstuetzend;
	}

	public void setUnterstuetzend(boolean unterstuetzend) {
		this.unterstuetzend = unterstuetzend;
	}

	public boolean isVueterlich() {
		return vueterlich;
	}

	public void setVueterlich(boolean vueterlich) {
		this.vueterlich = vueterlich;
	}

	public boolean isVerantwortungsvoll() {
		return verantwortungsvoll;
	}

	public void setVerantwortungsvoll(boolean verantwortungsvoll) {
		this.verantwortungsvoll = verantwortungsvoll;
	}

	public boolean isVerluesslich() {
		return verluesslich;
	}

	public void setVerluesslich(boolean verluesslich) {
		this.verluesslich = verluesslich;
	}

	public boolean isVerstuendnisvoll() {
		return verstuendnisvoll;
	}

	public void setVerstuendnisvoll(boolean verstuendnisvoll) {
		this.verstuendnisvoll = verstuendnisvoll;
	}

	public boolean isVertrauenswuerdig() {
		return vertrauenswuerdig;
	}

	public void setVertrauenswuerdig(boolean vertrauenswuerdig) {
		this.vertrauenswuerdig = vertrauenswuerdig;
	}

	public boolean isVielschichtig() {
		return vielschichtig;
	}

	public void setVielschichtig(boolean vielschichtig) {
		this.vielschichtig = vielschichtig;
	}

	public boolean isWeltoffen() {
		return weltoffen;
	}

	public void setWeltoffen(boolean weltoffen) {
		this.weltoffen = weltoffen;
	}

	public boolean isWerteorientiert() {
		return werteorientiert;
	}

	public void setWerteorientiert(boolean werteorientiert) {
		this.werteorientiert = werteorientiert;
	}

	public boolean isWillensstark() {
		return willensstark;
	}

	public void setWillensstark(boolean willensstark) {
		this.willensstark = willensstark;
	}

	public boolean isWissbegierig() {
		return wissbegierig;
	}

	public void setWissbegierig(boolean wissbegierig) {
		this.wissbegierig = wissbegierig;
	}

	public boolean isWortgewandt() {
		return wortgewandt;
	}

	public void setWortgewandt(boolean wortgewandt) {
		this.wortgewandt = wortgewandt;
	}

	public boolean isWortkarg() {
		return wortkarg;
	}

	public void setWortkarg(boolean wortkarg) {
		this.wortkarg = wortkarg;
	}

	public boolean isZielstrebig() {
		return zielstrebig;
	}

	public void setZielstrebig(boolean zielstrebig) {
		this.zielstrebig = zielstrebig;
	}

	public boolean isZukunftsorientiert() {
		return zukunftsorientiert;
	}

	public void setZukunftsorientiert(boolean zukunftsorientiert) {
		this.zukunftsorientiert = zukunftsorientiert;
	}

	public boolean isZuverluessig() {
		return zuverluessig;
	}

	public void setZuverluessig(boolean zuverluessig) {
		this.zuverluessig = zuverluessig;
	}

	public boolean isZuversichtlich() {
		return zuversichtlich;
	}

	public void setZuversichtlich(boolean zuversichtlich) {
		this.zuversichtlich = zuversichtlich;
	}

	public boolean isZuvorkommend() {
		return zuvorkommend;
	}

	public void setZuvorkommend(boolean zuvorkommend) {
		this.zuvorkommend = zuvorkommend;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (abenteuerlustig ? 1231 : 1237);
		result = prime * result + (aberglueubisch ? 1231 : 1237);
		result = prime * result + (absprachefuehig ? 1231 : 1237);
		result = prime * result + (achtsam ? 1231 : 1237);
		result = prime * result + (adrett ? 1231 : 1237);
		result = prime * result + (affektiert ? 1231 : 1237);
		result = prime * result + (agil ? 1231 : 1237);
		result = prime * result + (akkurat ? 1231 : 1237);
		result = prime * result + (akribisch ? 1231 : 1237);
		result = prime * result + (aktiv ? 1231 : 1237);
		result = prime * result + (albern ? 1231 : 1237);
		result = prime * result + (altmodisch ? 1231 : 1237);
		result = prime * result + (ambitioniert ? 1231 : 1237);
		result = prime * result + (amuesant ? 1231 : 1237);
		result = prime * result + (analytisch ? 1231 : 1237);
		result = prime * result + (anders ? 1231 : 1237);
		result = prime * result + (angepasst ? 1231 : 1237);
		result = prime * result + (angespannt ? 1231 : 1237);
		result = prime * result + (angriffslustig ? 1231 : 1237);
		result = prime * result + (angstfrei ? 1231 : 1237);
		result = prime * result + (anmutig ? 1231 : 1237);
		result = prime * result + (annehmend ? 1231 : 1237);
		result = prime * result + (anpackend ? 1231 : 1237);
		result = prime * result + (anpassungsbereit ? 1231 : 1237);
		result = prime * result + (anpassungsfuehig ? 1231 : 1237);
		result = prime * result + (anspruchslos ? 1231 : 1237);
		result = prime * result + (anspruchsvoll ? 1231 : 1237);
		result = prime * result + (anstrengend ? 1231 : 1237);
		result = prime * result + (anstuendig ? 1231 : 1237);
		result = prime * result + (arbeitsam ? 1231 : 1237);
		result = prime * result + (athletisch ? 1231 : 1237);
		result = prime * result + (aufbauend ? 1231 : 1237);
		result = prime * result + (aufgeschlossen ? 1231 : 1237);
		result = prime * result + (aufgeweckt ? 1231 : 1237);
		result = prime * result + (aufmerksam ? 1231 : 1237);
		result = prime * result + (aufmunternd ? 1231 : 1237);
		result = prime * result + (aufopferungsvoll ? 1231 : 1237);
		result = prime * result + (aufregend ? 1231 : 1237);
		result = prime * result + (aufrichtig ? 1231 : 1237);
		result = prime * result + (ausdauernd ? 1231 : 1237);
		result = prime * result + (ausdrucksstark ? 1231 : 1237);
		result = prime * result + (ausluenderfreundlich ? 1231 : 1237);
		result = prime * result + (authentisch ? 1231 : 1237);
		result = prime * result + (autonom ? 1231 : 1237);
		result = prime * result + (autorituer ? 1231 : 1237);
		result = prime * result + (bedacht ? 1231 : 1237);
		result = prime * result + (bedenkenlos ? 1231 : 1237);
		result = prime * result + (begabt ? 1231 : 1237);
		result = prime * result + (begeisterungsfuehig ? 1231 : 1237);
		result = prime * result + (begnuegsam ? 1231 : 1237);
		result = prime * result + (beherzt ? 1231 : 1237);
		result = prime * result + (behutsam ? 1231 : 1237);
		result = prime * result + (belastbar ? 1231 : 1237);
		result = prime * result + (belesen ? 1231 : 1237);
		result = prime * result + (beliebt ? 1231 : 1237);
		result = prime * result + (bemutternd ? 1231 : 1237);
		result = prime * result + (bescheiden ? 1231 : 1237);
		result = prime * result + (beschuetzerisch ? 1231 : 1237);
		result = prime * result + (bestuendig ? 1231 : 1237);
		result = prime * result + (beweglich ? 1231 : 1237);
		result = prime * result + (bodenstuendig ? 1231 : 1237);
		result = prime * result + (brav ? 1231 : 1237);
		result = prime * result + (bruederlich ? 1231 : 1237);
		result = prime * result + (burschikos ? 1231 : 1237);
		result = prime * result + (buerokratisch ? 1231 : 1237);
		result = prime * result + (chaotisch ? 1231 : 1237);
		result = prime * result + (charakterstark ? 1231 : 1237);
		result = prime * result + (charismatisch ? 1231 : 1237);
		result = prime * result + (charmant ? 1231 : 1237);
		result = prime * result + (clever ? 1231 : 1237);
		result = prime * result + (couragiert ? 1231 : 1237);
		result = prime * result + (damenhaft ? 1231 : 1237);
		result = prime * result + (dankbar ? 1231 : 1237);
		result = prime * result + (defensiv ? 1231 : 1237);
		result = prime * result + (detailverliebt ? 1231 : 1237);
		result = prime * result + (diplomatisch ? 1231 : 1237);
		result = prime * result + (direkt ? 1231 : 1237);
		result = prime * result + (diskret ? 1231 : 1237);
		result = prime * result + (diskussionsfreudig ? 1231 : 1237);
		result = prime * result + (diszipliniert ? 1231 : 1237);
		result = prime * result + (durchsetzungsstark ? 1231 : 1237);
		result = prime * result + (dusselig ? 1231 : 1237);
		result = prime * result + (dynamisch ? 1231 : 1237);
		result = prime * result + (effizient ? 1231 : 1237);
		result = prime * result + (ehrenhaft ? 1231 : 1237);
		result = prime * result + (ehrfuerchtig ? 1231 : 1237);
		result = prime * result + (ehrgeizig ? 1231 : 1237);
		result = prime * result + (ehrlich ? 1231 : 1237);
		result = prime * result + (eifrig ? 1231 : 1237);
		result = prime * result + (eigenbestimmt ? 1231 : 1237);
		result = prime * result + (eigenstuendig ? 1231 : 1237);
		result = prime * result + (einfach ? 1231 : 1237);
		result = prime * result + (einfallsreich ? 1231 : 1237);
		result = prime * result + (einfuehlsam ? 1231 : 1237);
		result = prime * result + (einzelguengerisch ? 1231 : 1237);
		result = prime * result + (elegant ? 1231 : 1237);
		result = prime * result + (emotional ? 1231 : 1237);
		result = prime * result + (emotionslos ? 1231 : 1237);
		result = prime * result + (empathisch ? 1231 : 1237);
		result = prime * result + (engagiert ? 1231 : 1237);
		result = prime * result + (enthaltsam ? 1231 : 1237);
		result = prime * result + (enthusiastisch ? 1231 : 1237);
		result = prime * result + (erfinderisch ? 1231 : 1237);
		result = prime * result + (erfolgreich ? 1231 : 1237);
		result = prime * result + (erfolgsorientiert ? 1231 : 1237);
		result = prime * result + (ernst ? 1231 : 1237);
		result = prime * result + (fantasievoll ? 1231 : 1237);
		result = prime * result + (feinfuehlig ? 1231 : 1237);
		result = prime * result + (feminin ? 1231 : 1237);
		result = prime * result + (feministisch ? 1231 : 1237);
		result = prime * result + (feurig ? 1231 : 1237);
		result = prime * result + (fleiueig ? 1231 : 1237);
		result = prime * result + (flexibel ? 1231 : 1237);
		result = prime * result + (freiheitsliebend ? 1231 : 1237);
		result = prime * result + (freundlich ? 1231 : 1237);
		result = prime * result + (friedliebend ? 1231 : 1237);
		result = prime * result + (gastfreundlich ? 1231 : 1237);
		result = prime * result + (gebildet ? 1231 : 1237);
		result = prime * result + (geduldig ? 1231 : 1237);
		result = prime * result + (gefuehlvoll ? 1231 : 1237);
		result = prime * result + (genau ? 1231 : 1237);
		result = prime * result + (genauigkeitsliebend ? 1231 : 1237);
		result = prime * result + (genuegsam ? 1231 : 1237);
		result = prime * result + (gerechtigkeitsliebend ? 1231 : 1237);
		result = prime * result + (gescheit ? 1231 : 1237);
		result = prime * result + (geschickt ? 1231 : 1237);
		result = prime * result + (gesellig ? 1231 : 1237);
		result = prime * result + (gespruechig ? 1231 : 1237);
		result = prime * result + (gesundheitsbewusst ? 1231 : 1237);
		result = prime * result + (gewissenhaft ? 1231 : 1237);
		result = prime * result + (glaubensstark ? 1231 : 1237);
		result = prime * result + (gruendlich ? 1231 : 1237);
		result = prime * result + (gutherzig ? 1231 : 1237);
		result = prime * result + (guetig ? 1231 : 1237);
		result = prime * result + (harmoniebeduerftig ? 1231 : 1237);
		result = prime * result + (hartnueckig ? 1231 : 1237);
		result = prime * result + (hilfsbereit ? 1231 : 1237);
		result = prime * result + (hingebungsvoll ? 1231 : 1237);
		result = prime * result + (hochbegabt ? 1231 : 1237);
		result = prime * result + (humorvoll ? 1231 : 1237);
		result = prime * result + (hueflich ? 1231 : 1237);
		result = prime * result + id;
		result = prime * result + (idealistisch ? 1231 : 1237);
		result = prime * result + (ideenreich ? 1231 : 1237);
		result = prime * result + (initiativ ? 1231 : 1237);
		result = prime * result + (intelligent ? 1231 : 1237);
		result = prime * result + (interessiert ? 1231 : 1237);
		result = prime * result + (introvertiert ? 1231 : 1237);
		result = prime * result + (jugendlich ? 1231 : 1237);
		result = prime * result + (kinderlieb ? 1231 : 1237);
		result = prime * result + (kindisch ? 1231 : 1237);
		result = prime * result + (kindlich ? 1231 : 1237);
		result = prime * result + (kompromissbereit ? 1231 : 1237);
		result = prime * result + (konfliktfreudig ? 1231 : 1237);
		result = prime * result + (konfliktscheu ? 1231 : 1237);
		result = prime * result + (kontaktfreudig ? 1231 : 1237);
		result = prime * result + (kreativ ? 1231 : 1237);
		result = prime * result + (kritikfuehig ? 1231 : 1237);
		result = prime * result + (kultiviert ? 1231 : 1237);
		result = prime * result + (kumpelhaft ? 1231 : 1237);
		result = prime * result + (kurios ? 1231 : 1237);
		result = prime * result + (kuempferisch ? 1231 : 1237);
		result = prime * result + (kuenstlerisch ? 1231 : 1237);
		result = prime * result + (lebhaft ? 1231 : 1237);
		result = prime * result + (leidenschaftlich ? 1231 : 1237);
		result = prime * result + (lernbereit ? 1231 : 1237);
		result = prime * result + (liebevoll ? 1231 : 1237);
		result = prime * result + (lustig ? 1231 : 1237);
		result = prime * result + (lustvoll ? 1231 : 1237);
		result = prime * result + (menschenfreundlich ? 1231 : 1237);
		result = prime * result + (mitfuehlend ? 1231 : 1237);
		result = prime * result + (modebewusst ? 1231 : 1237);
		result = prime * result + (musikalisch ? 1231 : 1237);
		result = prime * result + (muetterlich ? 1231 : 1237);
		result = prime * result + (nachdenklich ? 1231 : 1237);
		result = prime * result + (naturverbunden ? 1231 : 1237);
		result = prime * result + (neugierig ? 1231 : 1237);
		result = prime * result + (neutral ? 1231 : 1237);
		result = prime * result + (nuehesuchend ? 1231 : 1237);
		result = prime * result + (objektiv ? 1231 : 1237);
		result = prime * result + (offen ? 1231 : 1237);
		result = prime * result + (ordentlich ? 1231 : 1237);
		result = prime * result + (ordnungsliebend ? 1231 : 1237);
		result = prime * result + (perfektionistisch ? 1231 : 1237);
		result = prime * result + (pflichtbewusst ? 1231 : 1237);
		result = prime * result + (phantasievoll ? 1231 : 1237);
		result = prime * result + (planend ? 1231 : 1237);
		result = prime * result + (problemluesend ? 1231 : 1237);
		result = prime * result + (querdenkend ? 1231 : 1237);
		result = prime * result + (quirlig ? 1231 : 1237);
		result = prime * result + (rational ? 1231 : 1237);
		result = prime * result + (redselig ? 1231 : 1237);
		result = prime * result + (reiselustig ? 1231 : 1237);
		result = prime * result + (religiues ? 1231 : 1237);
		result = prime * result + (respektvoll ? 1231 : 1237);
		result = prime * result + (romantisch ? 1231 : 1237);
		result = prime * result + (ruhig ? 1231 : 1237);
		result = prime * result + (ruecksichtsvoll ? 1231 : 1237);
		result = prime * result + (sachlich ? 1231 : 1237);
		result = prime * result + (schuechtern ? 1231 : 1237);
		result = prime * result + (selbstkritisch ? 1231 : 1237);
		result = prime * result + (selbstreflektierend ? 1231 : 1237);
		result = prime * result + (sensibel ? 1231 : 1237);
		result = prime * result + (sparsam ? 1231 : 1237);
		result = prime * result + (spirituell ? 1231 : 1237);
		result = prime * result + (spontan ? 1231 : 1237);
		result = prime * result + (sportlich ? 1231 : 1237);
		result = prime * result + (sprachbegabt ? 1231 : 1237);
		result = prime * result + (strategisch ? 1231 : 1237);
		result = prime * result + (streng ? 1231 : 1237);
		result = prime * result + (teamfuehig ? 1231 : 1237);
		result = prime * result + (temperamentvoll ? 1231 : 1237);
		result = prime * result + (tiefgruendig ? 1231 : 1237);
		result = prime * result + (tierlieb ? 1231 : 1237);
		result = prime * result + (tolerant ? 1231 : 1237);
		result = prime * result + (treuherzig ? 1231 : 1237);
		result = prime * result + (tuechtig ? 1231 : 1237);
		result = prime * result + (unternehmungsfreudig ? 1231 : 1237);
		result = prime * result + (unternehmungslustig ? 1231 : 1237);
		result = prime * result + (unterstuetzend ? 1231 : 1237);
		result = prime * result + (verantwortungsvoll ? 1231 : 1237);
		result = prime * result + (verluesslich ? 1231 : 1237);
		result = prime * result + (verstuendnisvoll ? 1231 : 1237);
		result = prime * result + (vertrauenswuerdig ? 1231 : 1237);
		result = prime * result + (vielschichtig ? 1231 : 1237);
		result = prime * result + (vueterlich ? 1231 : 1237);
		result = prime * result + (weltoffen ? 1231 : 1237);
		result = prime * result + (werteorientiert ? 1231 : 1237);
		result = prime * result + (willensstark ? 1231 : 1237);
		result = prime * result + (wissbegierig ? 1231 : 1237);
		result = prime * result + (wortgewandt ? 1231 : 1237);
		result = prime * result + (wortkarg ? 1231 : 1237);
		result = prime * result + (zielstrebig ? 1231 : 1237);
		result = prime * result + (zukunftsorientiert ? 1231 : 1237);
		result = prime * result + (zuverluessig ? 1231 : 1237);
		result = prime * result + (zuversichtlich ? 1231 : 1237);
		result = prime * result + (zuvorkommend ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserCharakterModel other = (UserCharakterModel) obj;
		if (abenteuerlustig != other.abenteuerlustig)
			return false;
		if (aberglueubisch != other.aberglueubisch)
			return false;
		if (absprachefuehig != other.absprachefuehig)
			return false;
		if (achtsam != other.achtsam)
			return false;
		if (adrett != other.adrett)
			return false;
		if (affektiert != other.affektiert)
			return false;
		if (agil != other.agil)
			return false;
		if (akkurat != other.akkurat)
			return false;
		if (akribisch != other.akribisch)
			return false;
		if (aktiv != other.aktiv)
			return false;
		if (albern != other.albern)
			return false;
		if (altmodisch != other.altmodisch)
			return false;
		if (ambitioniert != other.ambitioniert)
			return false;
		if (amuesant != other.amuesant)
			return false;
		if (analytisch != other.analytisch)
			return false;
		if (anders != other.anders)
			return false;
		if (angepasst != other.angepasst)
			return false;
		if (angespannt != other.angespannt)
			return false;
		if (angriffslustig != other.angriffslustig)
			return false;
		if (angstfrei != other.angstfrei)
			return false;
		if (anmutig != other.anmutig)
			return false;
		if (annehmend != other.annehmend)
			return false;
		if (anpackend != other.anpackend)
			return false;
		if (anpassungsbereit != other.anpassungsbereit)
			return false;
		if (anpassungsfuehig != other.anpassungsfuehig)
			return false;
		if (anspruchslos != other.anspruchslos)
			return false;
		if (anspruchsvoll != other.anspruchsvoll)
			return false;
		if (anstrengend != other.anstrengend)
			return false;
		if (anstuendig != other.anstuendig)
			return false;
		if (arbeitsam != other.arbeitsam)
			return false;
		if (athletisch != other.athletisch)
			return false;
		if (aufbauend != other.aufbauend)
			return false;
		if (aufgeschlossen != other.aufgeschlossen)
			return false;
		if (aufgeweckt != other.aufgeweckt)
			return false;
		if (aufmerksam != other.aufmerksam)
			return false;
		if (aufmunternd != other.aufmunternd)
			return false;
		if (aufopferungsvoll != other.aufopferungsvoll)
			return false;
		if (aufregend != other.aufregend)
			return false;
		if (aufrichtig != other.aufrichtig)
			return false;
		if (ausdauernd != other.ausdauernd)
			return false;
		if (ausdrucksstark != other.ausdrucksstark)
			return false;
		if (ausluenderfreundlich != other.ausluenderfreundlich)
			return false;
		if (authentisch != other.authentisch)
			return false;
		if (autonom != other.autonom)
			return false;
		if (autorituer != other.autorituer)
			return false;
		if (bedacht != other.bedacht)
			return false;
		if (bedenkenlos != other.bedenkenlos)
			return false;
		if (begabt != other.begabt)
			return false;
		if (begeisterungsfuehig != other.begeisterungsfuehig)
			return false;
		if (begnuegsam != other.begnuegsam)
			return false;
		if (beherzt != other.beherzt)
			return false;
		if (behutsam != other.behutsam)
			return false;
		if (belastbar != other.belastbar)
			return false;
		if (belesen != other.belesen)
			return false;
		if (beliebt != other.beliebt)
			return false;
		if (bemutternd != other.bemutternd)
			return false;
		if (bescheiden != other.bescheiden)
			return false;
		if (beschuetzerisch != other.beschuetzerisch)
			return false;
		if (bestuendig != other.bestuendig)
			return false;
		if (beweglich != other.beweglich)
			return false;
		if (bodenstuendig != other.bodenstuendig)
			return false;
		if (brav != other.brav)
			return false;
		if (bruederlich != other.bruederlich)
			return false;
		if (burschikos != other.burschikos)
			return false;
		if (buerokratisch != other.buerokratisch)
			return false;
		if (chaotisch != other.chaotisch)
			return false;
		if (charakterstark != other.charakterstark)
			return false;
		if (charismatisch != other.charismatisch)
			return false;
		if (charmant != other.charmant)
			return false;
		if (clever != other.clever)
			return false;
		if (couragiert != other.couragiert)
			return false;
		if (damenhaft != other.damenhaft)
			return false;
		if (dankbar != other.dankbar)
			return false;
		if (defensiv != other.defensiv)
			return false;
		if (detailverliebt != other.detailverliebt)
			return false;
		if (diplomatisch != other.diplomatisch)
			return false;
		if (direkt != other.direkt)
			return false;
		if (diskret != other.diskret)
			return false;
		if (diskussionsfreudig != other.diskussionsfreudig)
			return false;
		if (diszipliniert != other.diszipliniert)
			return false;
		if (durchsetzungsstark != other.durchsetzungsstark)
			return false;
		if (dusselig != other.dusselig)
			return false;
		if (dynamisch != other.dynamisch)
			return false;
		if (effizient != other.effizient)
			return false;
		if (ehrenhaft != other.ehrenhaft)
			return false;
		if (ehrfuerchtig != other.ehrfuerchtig)
			return false;
		if (ehrgeizig != other.ehrgeizig)
			return false;
		if (ehrlich != other.ehrlich)
			return false;
		if (eifrig != other.eifrig)
			return false;
		if (eigenbestimmt != other.eigenbestimmt)
			return false;
		if (eigenstuendig != other.eigenstuendig)
			return false;
		if (einfach != other.einfach)
			return false;
		if (einfallsreich != other.einfallsreich)
			return false;
		if (einfuehlsam != other.einfuehlsam)
			return false;
		if (einzelguengerisch != other.einzelguengerisch)
			return false;
		if (elegant != other.elegant)
			return false;
		if (emotional != other.emotional)
			return false;
		if (emotionslos != other.emotionslos)
			return false;
		if (empathisch != other.empathisch)
			return false;
		if (engagiert != other.engagiert)
			return false;
		if (enthaltsam != other.enthaltsam)
			return false;
		if (enthusiastisch != other.enthusiastisch)
			return false;
		if (erfinderisch != other.erfinderisch)
			return false;
		if (erfolgreich != other.erfolgreich)
			return false;
		if (erfolgsorientiert != other.erfolgsorientiert)
			return false;
		if (ernst != other.ernst)
			return false;
		if (fantasievoll != other.fantasievoll)
			return false;
		if (feinfuehlig != other.feinfuehlig)
			return false;
		if (feminin != other.feminin)
			return false;
		if (feministisch != other.feministisch)
			return false;
		if (feurig != other.feurig)
			return false;
		if (fleiueig != other.fleiueig)
			return false;
		if (flexibel != other.flexibel)
			return false;
		if (freiheitsliebend != other.freiheitsliebend)
			return false;
		if (freundlich != other.freundlich)
			return false;
		if (friedliebend != other.friedliebend)
			return false;
		if (gastfreundlich != other.gastfreundlich)
			return false;
		if (gebildet != other.gebildet)
			return false;
		if (geduldig != other.geduldig)
			return false;
		if (gefuehlvoll != other.gefuehlvoll)
			return false;
		if (genau != other.genau)
			return false;
		if (genauigkeitsliebend != other.genauigkeitsliebend)
			return false;
		if (genuegsam != other.genuegsam)
			return false;
		if (gerechtigkeitsliebend != other.gerechtigkeitsliebend)
			return false;
		if (gescheit != other.gescheit)
			return false;
		if (geschickt != other.geschickt)
			return false;
		if (gesellig != other.gesellig)
			return false;
		if (gespruechig != other.gespruechig)
			return false;
		if (gesundheitsbewusst != other.gesundheitsbewusst)
			return false;
		if (gewissenhaft != other.gewissenhaft)
			return false;
		if (glaubensstark != other.glaubensstark)
			return false;
		if (gruendlich != other.gruendlich)
			return false;
		if (gutherzig != other.gutherzig)
			return false;
		if (guetig != other.guetig)
			return false;
		if (harmoniebeduerftig != other.harmoniebeduerftig)
			return false;
		if (hartnueckig != other.hartnueckig)
			return false;
		if (hilfsbereit != other.hilfsbereit)
			return false;
		if (hingebungsvoll != other.hingebungsvoll)
			return false;
		if (hochbegabt != other.hochbegabt)
			return false;
		if (humorvoll != other.humorvoll)
			return false;
		if (hueflich != other.hueflich)
			return false;
		if (id != other.id)
			return false;
		if (idealistisch != other.idealistisch)
			return false;
		if (ideenreich != other.ideenreich)
			return false;
		if (initiativ != other.initiativ)
			return false;
		if (intelligent != other.intelligent)
			return false;
		if (interessiert != other.interessiert)
			return false;
		if (introvertiert != other.introvertiert)
			return false;
		if (jugendlich != other.jugendlich)
			return false;
		if (kinderlieb != other.kinderlieb)
			return false;
		if (kindisch != other.kindisch)
			return false;
		if (kindlich != other.kindlich)
			return false;
		if (kompromissbereit != other.kompromissbereit)
			return false;
		if (konfliktfreudig != other.konfliktfreudig)
			return false;
		if (konfliktscheu != other.konfliktscheu)
			return false;
		if (kontaktfreudig != other.kontaktfreudig)
			return false;
		if (kreativ != other.kreativ)
			return false;
		if (kritikfuehig != other.kritikfuehig)
			return false;
		if (kultiviert != other.kultiviert)
			return false;
		if (kumpelhaft != other.kumpelhaft)
			return false;
		if (kurios != other.kurios)
			return false;
		if (kuempferisch != other.kuempferisch)
			return false;
		if (kuenstlerisch != other.kuenstlerisch)
			return false;
		if (lebhaft != other.lebhaft)
			return false;
		if (leidenschaftlich != other.leidenschaftlich)
			return false;
		if (lernbereit != other.lernbereit)
			return false;
		if (liebevoll != other.liebevoll)
			return false;
		if (lustig != other.lustig)
			return false;
		if (lustvoll != other.lustvoll)
			return false;
		if (menschenfreundlich != other.menschenfreundlich)
			return false;
		if (mitfuehlend != other.mitfuehlend)
			return false;
		if (modebewusst != other.modebewusst)
			return false;
		if (musikalisch != other.musikalisch)
			return false;
		if (muetterlich != other.muetterlich)
			return false;
		if (nachdenklich != other.nachdenklich)
			return false;
		if (naturverbunden != other.naturverbunden)
			return false;
		if (neugierig != other.neugierig)
			return false;
		if (neutral != other.neutral)
			return false;
		if (nuehesuchend != other.nuehesuchend)
			return false;
		if (objektiv != other.objektiv)
			return false;
		if (offen != other.offen)
			return false;
		if (ordentlich != other.ordentlich)
			return false;
		if (ordnungsliebend != other.ordnungsliebend)
			return false;
		if (perfektionistisch != other.perfektionistisch)
			return false;
		if (pflichtbewusst != other.pflichtbewusst)
			return false;
		if (phantasievoll != other.phantasievoll)
			return false;
		if (planend != other.planend)
			return false;
		if (problemluesend != other.problemluesend)
			return false;
		if (querdenkend != other.querdenkend)
			return false;
		if (quirlig != other.quirlig)
			return false;
		if (rational != other.rational)
			return false;
		if (redselig != other.redselig)
			return false;
		if (reiselustig != other.reiselustig)
			return false;
		if (religiues != other.religiues)
			return false;
		if (respektvoll != other.respektvoll)
			return false;
		if (romantisch != other.romantisch)
			return false;
		if (ruhig != other.ruhig)
			return false;
		if (ruecksichtsvoll != other.ruecksichtsvoll)
			return false;
		if (sachlich != other.sachlich)
			return false;
		if (schuechtern != other.schuechtern)
			return false;
		if (selbstkritisch != other.selbstkritisch)
			return false;
		if (selbstreflektierend != other.selbstreflektierend)
			return false;
		if (sensibel != other.sensibel)
			return false;
		if (sparsam != other.sparsam)
			return false;
		if (spirituell != other.spirituell)
			return false;
		if (spontan != other.spontan)
			return false;
		if (sportlich != other.sportlich)
			return false;
		if (sprachbegabt != other.sprachbegabt)
			return false;
		if (strategisch != other.strategisch)
			return false;
		if (streng != other.streng)
			return false;
		if (teamfuehig != other.teamfuehig)
			return false;
		if (temperamentvoll != other.temperamentvoll)
			return false;
		if (tiefgruendig != other.tiefgruendig)
			return false;
		if (tierlieb != other.tierlieb)
			return false;
		if (tolerant != other.tolerant)
			return false;
		if (treuherzig != other.treuherzig)
			return false;
		if (tuechtig != other.tuechtig)
			return false;
		if (unternehmungsfreudig != other.unternehmungsfreudig)
			return false;
		if (unternehmungslustig != other.unternehmungslustig)
			return false;
		if (unterstuetzend != other.unterstuetzend)
			return false;
		if (verantwortungsvoll != other.verantwortungsvoll)
			return false;
		if (verluesslich != other.verluesslich)
			return false;
		if (verstuendnisvoll != other.verstuendnisvoll)
			return false;
		if (vertrauenswuerdig != other.vertrauenswuerdig)
			return false;
		if (vielschichtig != other.vielschichtig)
			return false;
		if (vueterlich != other.vueterlich)
			return false;
		if (weltoffen != other.weltoffen)
			return false;
		if (werteorientiert != other.werteorientiert)
			return false;
		if (willensstark != other.willensstark)
			return false;
		if (wissbegierig != other.wissbegierig)
			return false;
		if (wortgewandt != other.wortgewandt)
			return false;
		if (wortkarg != other.wortkarg)
			return false;
		if (zielstrebig != other.zielstrebig)
			return false;
		if (zukunftsorientiert != other.zukunftsorientiert)
			return false;
		if (zuverluessig != other.zuverluessig)
			return false;
		if (zuversichtlich != other.zuversichtlich)
			return false;
		if (zuvorkommend != other.zuvorkommend)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserCharakterModel [id=" + id + ", abenteuerlustig=" + abenteuerlustig + ", aberglueubisch="
				+ aberglueubisch + ", absprachefuehig=" + absprachefuehig + ", achtsam=" + achtsam + ", adrett=" + adrett
				+ ", affektiert=" + affektiert + ", agil=" + agil + ", akkurat=" + akkurat + ", akribisch=" + akribisch
				+ ", aktiv=" + aktiv + ", albern=" + albern + ", altmodisch=" + altmodisch + ", ambitioniert="
				+ ambitioniert + ", amuesant=" + amuesant + ", analytisch=" + analytisch + ", anders=" + anders
				+ ", angepasst=" + angepasst + ", angespannt=" + angespannt + ", angriffslustig=" + angriffslustig
				+ ", angstfrei=" + angstfrei + ", anmutig=" + anmutig + ", annehmend=" + annehmend + ", anpackend="
				+ anpackend + ", anpassungsbereit=" + anpassungsbereit + ", anpassungsfuehig=" + anpassungsfuehig
				+ ", anspruchslos=" + anspruchslos + ", anspruchsvoll=" + anspruchsvoll + ", anstuendig=" + anstuendig
				+ ", anstrengend=" + anstrengend + ", arbeitsam=" + arbeitsam + ", athletisch=" + athletisch
				+ ", aufbauend=" + aufbauend + ", aufgeschlossen=" + aufgeschlossen + ", aufgeweckt=" + aufgeweckt
				+ ", aufmerksam=" + aufmerksam + ", aufmunternd=" + aufmunternd + ", aufopferungsvoll="
				+ aufopferungsvoll + ", aufregend=" + aufregend + ", aufrichtig=" + aufrichtig + ", ausdauernd="
				+ ausdauernd + ", ausdrucksstark=" + ausdrucksstark + ", ausluenderfreundlich=" + ausluenderfreundlich
				+ ", authentisch=" + authentisch + ", autonom=" + autonom + ", autorituer=" + autorituer + ", bedacht="
				+ bedacht + ", bedenkenlos=" + bedenkenlos + ", begabt=" + begabt + ", begeisterungsfuehig="
				+ begeisterungsfuehig + ", begnuegsam=" + begnuegsam + ", beherzt=" + beherzt + ", behutsam=" + behutsam
				+ ", belastbar=" + belastbar + ", belesen=" + belesen + ", beliebt=" + beliebt + ", bemutternd="
				+ bemutternd + ", bescheiden=" + bescheiden + ", beschuetzerisch=" + beschuetzerisch + ", bestuendig="
				+ bestuendig + ", beweglich=" + beweglich + ", bodenstuendig=" + bodenstuendig + ", brav=" + brav
				+ ", bruederlich=" + bruederlich + ", buerokratisch=" + buerokratisch + ", burschikos=" + burschikos
				+ ", chaotisch=" + chaotisch + ", charakterstark=" + charakterstark + ", charismatisch=" + charismatisch
				+ ", charmant=" + charmant + ", clever=" + clever + ", couragiert=" + couragiert + ", damenhaft="
				+ damenhaft + ", dankbar=" + dankbar + ", defensiv=" + defensiv + ", detailverliebt=" + detailverliebt
				+ ", diplomatisch=" + diplomatisch + ", direkt=" + direkt + ", diskret=" + diskret
				+ ", diskussionsfreudig=" + diskussionsfreudig + ", diszipliniert=" + diszipliniert
				+ ", durchsetzungsstark=" + durchsetzungsstark + ", dusselig=" + dusselig + ", dynamisch=" + dynamisch
				+ ", effizient=" + effizient + ", ehrenhaft=" + ehrenhaft + ", ehrfuerchtig=" + ehrfuerchtig
				+ ", ehrgeizig=" + ehrgeizig + ", ehrlich=" + ehrlich + ", eifrig=" + eifrig + ", eigenbestimmt="
				+ eigenbestimmt + ", eigenstuendig=" + eigenstuendig + ", einfach=" + einfach + ", einfallsreich="
				+ einfallsreich + ", einfuehlsam=" + einfuehlsam + ", einzelguengerisch=" + einzelguengerisch + ", elegant="
				+ elegant + ", emotional=" + emotional + ", emotionslos=" + emotionslos + ", empathisch=" + empathisch
				+ ", engagiert=" + engagiert + ", enthaltsam=" + enthaltsam + ", enthusiastisch=" + enthusiastisch
				+ ", erfinderisch=" + erfinderisch + ", erfolgreich=" + erfolgreich + ", erfolgsorientiert="
				+ erfolgsorientiert + ", ernst=" + ernst + ", fantasievoll=" + fantasievoll + ", feinfuehlig="
				+ feinfuehlig + ", feminin=" + feminin + ", feministisch=" + feministisch + ", feurig=" + feurig
				+ ", fleiueig=" + fleiueig + ", flexibel=" + flexibel + ", freiheitsliebend=" + freiheitsliebend
				+ ", freundlich=" + freundlich + ", friedliebend=" + friedliebend + ", gastfreundlich=" + gastfreundlich
				+ ", gebildet=" + gebildet + ", geduldig=" + geduldig + ", gefuehlvoll=" + gefuehlvoll + ", genau="
				+ genau + ", genauigkeitsliebend=" + genauigkeitsliebend + ", genuegsam=" + genuegsam
				+ ", gerechtigkeitsliebend=" + gerechtigkeitsliebend + ", gescheit=" + gescheit + ", geschickt="
				+ geschickt + ", gesellig=" + gesellig + ", gespruechig=" + gespruechig + ", gesundheitsbewusst="
				+ gesundheitsbewusst + ", gewissenhaft=" + gewissenhaft + ", glaubensstark=" + glaubensstark
				+ ", gruendlich=" + gruendlich + ", guetig=" + guetig + ", gutherzig=" + gutherzig + ", harmoniebeduerftig="
				+ harmoniebeduerftig + ", hartnueckig=" + hartnueckig + ", hilfsbereit=" + hilfsbereit
				+ ", hingebungsvoll=" + hingebungsvoll + ", hochbegabt=" + hochbegabt + ", hueflich=" + hueflich
				+ ", humorvoll=" + humorvoll + ", idealistisch=" + idealistisch + ", ideenreich=" + ideenreich
				+ ", initiativ=" + initiativ + ", intelligent=" + intelligent + ", interessiert=" + interessiert
				+ ", introvertiert=" + introvertiert + ", jugendlich=" + jugendlich + ", kuempferisch=" + kuempferisch
				+ ", kinderlieb=" + kinderlieb + ", kindisch=" + kindisch + ", kindlich=" + kindlich
				+ ", kompromissbereit=" + kompromissbereit + ", konfliktfreudig=" + konfliktfreudig + ", konfliktscheu="
				+ konfliktscheu + ", kontaktfreudig=" + kontaktfreudig + ", kreativ=" + kreativ + ", kritikfuehig="
				+ kritikfuehig + ", kuenstlerisch=" + kuenstlerisch + ", kultiviert=" + kultiviert + ", kumpelhaft="
				+ kumpelhaft + ", kurios=" + kurios + ", lebhaft=" + lebhaft + ", leidenschaftlich=" + leidenschaftlich
				+ ", lernbereit=" + lernbereit + ", liebevoll=" + liebevoll + ", lustig=" + lustig + ", lustvoll="
				+ lustvoll + ", menschenfreundlich=" + menschenfreundlich + ", mitfuehlend=" + mitfuehlend
				+ ", modebewusst=" + modebewusst + ", muetterlich=" + muetterlich + ", musikalisch=" + musikalisch
				+ ", nachdenklich=" + nachdenklich + ", nuehesuchend=" + nuehesuchend + ", naturverbunden="
				+ naturverbunden + ", neugierig=" + neugierig + ", neutral=" + neutral + ", objektiv=" + objektiv
				+ ", offen=" + offen + ", ordentlich=" + ordentlich + ", ordnungsliebend=" + ordnungsliebend
				+ ", perfektionistisch=" + perfektionistisch + ", pflichtbewusst=" + pflichtbewusst + ", phantasievoll="
				+ phantasievoll + ", planend=" + planend + ", problemluesend=" + problemluesend + ", querdenkend="
				+ querdenkend + ", quirlig=" + quirlig + ", rational=" + rational + ", redselig=" + redselig
				+ ", reiselustig=" + reiselustig + ", religiues=" + religiues + ", respektvoll=" + respektvoll
				+ ", romantisch=" + romantisch + ", ruecksichtsvoll=" + ruecksichtsvoll + ", ruhig=" + ruhig
				+ ", sachlich=" + sachlich + ", schuechtern=" + schuechtern + ", selbstkritisch=" + selbstkritisch
				+ ", selbstreflektierend=" + selbstreflektierend + ", sensibel=" + sensibel + ", sparsam=" + sparsam
				+ ", spirituell=" + spirituell + ", spontan=" + spontan + ", sportlich=" + sportlich + ", sprachbegabt="
				+ sprachbegabt + ", strategisch=" + strategisch + ", streng=" + streng + ", teamfuehig=" + teamfuehig
				+ ", temperamentvoll=" + temperamentvoll + ", tiefgruendig=" + tiefgruendig + ", tierlieb=" + tierlieb
				+ ", tolerant=" + tolerant + ", treuherzig=" + treuherzig + ", tuechtig=" + tuechtig
				+ ", unternehmungsfreudig=" + unternehmungsfreudig + ", unternehmungslustig=" + unternehmungslustig
				+ ", unterstuetzend=" + unterstuetzend + ", vueterlich=" + vueterlich + ", verantwortungsvoll="
				+ verantwortungsvoll + ", verluesslich=" + verluesslich + ", verstuendnisvoll=" + verstuendnisvoll
				+ ", vertrauenswuerdig=" + vertrauenswuerdig + ", vielschichtig=" + vielschichtig + ", weltoffen="
				+ weltoffen + ", werteorientiert=" + werteorientiert + ", willensstark=" + willensstark
				+ ", wissbegierig=" + wissbegierig + ", wortgewandt=" + wortgewandt + ", wortkarg=" + wortkarg
				+ ", zielstrebig=" + zielstrebig + ", zukunftsorientiert=" + zukunftsorientiert + ", zuverluessig="
				+ zuverluessig + ", zuversichtlich=" + zuversichtlich + ", zuvorkommend=" + zuvorkommend + "]";
	}

	public UserCharakterModel() {
		super();
	}

	public UserCharakterModel(boolean abenteuerlustig, boolean aberglueubisch, boolean absprachefuehig, boolean achtsam,
			boolean adrett, boolean affektiert, boolean agil, boolean akkurat, boolean akribisch, boolean aktiv,
			boolean albern, boolean altmodisch, boolean ambitioniert, boolean amuesant, boolean analytisch,
			boolean anders, boolean angepasst, boolean angespannt, boolean angriffslustig, boolean angstfrei,
			boolean anmutig, boolean annehmend, boolean anpackend, boolean anpassungsbereit, boolean anpassungsfuehig,
			boolean anspruchslos, boolean anspruchsvoll, boolean anstuendig, boolean anstrengend, boolean arbeitsam,
			boolean athletisch, boolean aufbauend, boolean aufgeschlossen, boolean aufgeweckt, boolean aufmerksam,
			boolean aufmunternd, boolean aufopferungsvoll, boolean aufregend, boolean aufrichtig, boolean ausdauernd,
			boolean ausdrucksstark, boolean ausluenderfreundlich, boolean authentisch, boolean autonom,
			boolean autorituer, boolean bedacht, boolean bedenkenlos, boolean begabt, boolean begeisterungsfuehig,
			boolean begnuegsam, boolean beherzt, boolean behutsam, boolean belastbar, boolean belesen, boolean beliebt,
			boolean bemutternd, boolean bescheiden, boolean beschuetzerisch, boolean bestuendig, boolean beweglich,
			boolean bodenstuendig, boolean brav, boolean bruederlich, boolean buerokratisch, boolean burschikos,
			boolean chaotisch, boolean charakterstark, boolean charismatisch, boolean charmant, boolean clever,
			boolean couragiert, boolean damenhaft, boolean dankbar, boolean defensiv, boolean detailverliebt,
			boolean diplomatisch, boolean direkt, boolean diskret, boolean diskussionsfreudig, boolean diszipliniert,
			boolean durchsetzungsstark, boolean dusselig, boolean dynamisch, boolean effizient, boolean ehrenhaft,
			boolean ehrfuerchtig, boolean ehrgeizig, boolean ehrlich, boolean eifrig, boolean eigenbestimmt,
			boolean eigenstuendig, boolean einfach, boolean einfallsreich, boolean einfuehlsam, boolean einzelguengerisch,
			boolean elegant, boolean emotional, boolean emotionslos, boolean empathisch, boolean engagiert,
			boolean enthaltsam, boolean enthusiastisch, boolean erfinderisch, boolean erfolgreich,
			boolean erfolgsorientiert, boolean ernst, boolean fantasievoll, boolean feinfuehlig, boolean feminin,
			boolean feministisch, boolean feurig, boolean fleiueig, boolean flexibel, boolean freiheitsliebend,
			boolean freundlich, boolean friedliebend, boolean gastfreundlich, boolean gebildet, boolean geduldig,
			boolean gefuehlvoll, boolean genau, boolean genauigkeitsliebend, boolean genuegsam,
			boolean gerechtigkeitsliebend, boolean gescheit, boolean geschickt, boolean gesellig, boolean gespruechig,
			boolean gesundheitsbewusst, boolean gewissenhaft, boolean glaubensstark, boolean gruendlich, boolean guetig,
			boolean gutherzig, boolean harmoniebeduerftig, boolean hartnueckig, boolean hilfsbereit,
			boolean hingebungsvoll, boolean hochbegabt, boolean hueflich, boolean humorvoll, boolean idealistisch,
			boolean ideenreich, boolean initiativ, boolean intelligent, boolean interessiert, boolean introvertiert,
			boolean jugendlich, boolean kuempferisch, boolean kinderlieb, boolean kindisch, boolean kindlich,
			boolean kompromissbereit, boolean konfliktfreudig, boolean konfliktscheu, boolean kontaktfreudig,
			boolean kreativ, boolean kritikfuehig, boolean kuenstlerisch, boolean kultiviert, boolean kumpelhaft,
			boolean kurios, boolean lebhaft, boolean leidenschaftlich, boolean lernbereit, boolean liebevoll,
			boolean lustig, boolean lustvoll, boolean menschenfreundlich, boolean mitfuehlend, boolean modebewusst,
			boolean muetterlich, boolean musikalisch, boolean nachdenklich, boolean nuehesuchend, boolean naturverbunden,
			boolean neugierig, boolean neutral, boolean objektiv, boolean offen, boolean ordentlich,
			boolean ordnungsliebend, boolean perfektionistisch, boolean pflichtbewusst, boolean phantasievoll,
			boolean planend, boolean problemluesend, boolean querdenkend, boolean quirlig, boolean rational,
			boolean redselig, boolean reiselustig, boolean religiues, boolean respektvoll, boolean romantisch,
			boolean ruecksichtsvoll, boolean ruhig, boolean sachlich, boolean schuechtern, boolean selbstkritisch,
			boolean selbstreflektierend, boolean sensibel, boolean sparsam, boolean spirituell, boolean spontan,
			boolean sportlich, boolean sprachbegabt, boolean strategisch, boolean streng, boolean teamfuehig,
			boolean temperamentvoll, boolean tiefgruendig, boolean tierlieb, boolean tolerant, boolean treuherzig,
			boolean tuechtig, boolean unternehmungsfreudig, boolean unternehmungslustig, boolean unterstuetzend,
			boolean vueterlich, boolean verantwortungsvoll, boolean verluesslich, boolean verstuendnisvoll,
			boolean vertrauenswuerdig, boolean vielschichtig, boolean weltoffen, boolean werteorientiert,
			boolean willensstark, boolean wissbegierig, boolean wortgewandt, boolean wortkarg, boolean zielstrebig,
			boolean zukunftsorientiert, boolean zuverluessig, boolean zuversichtlich, boolean zuvorkommend) {
		super();
		this.abenteuerlustig = abenteuerlustig;
		this.aberglueubisch = aberglueubisch;
		this.absprachefuehig = absprachefuehig;
		this.achtsam = achtsam;
		this.adrett = adrett;
		this.affektiert = affektiert;
		this.agil = agil;
		this.akkurat = akkurat;
		this.akribisch = akribisch;
		this.aktiv = aktiv;
		this.albern = albern;
		this.altmodisch = altmodisch;
		this.ambitioniert = ambitioniert;
		this.amuesant = amuesant;
		this.analytisch = analytisch;
		this.anders = anders;
		this.angepasst = angepasst;
		this.angespannt = angespannt;
		this.angriffslustig = angriffslustig;
		this.angstfrei = angstfrei;
		this.anmutig = anmutig;
		this.annehmend = annehmend;
		this.anpackend = anpackend;
		this.anpassungsbereit = anpassungsbereit;
		this.anpassungsfuehig = anpassungsfuehig;
		this.anspruchslos = anspruchslos;
		this.anspruchsvoll = anspruchsvoll;
		this.anstuendig = anstuendig;
		this.anstrengend = anstrengend;
		this.arbeitsam = arbeitsam;
		this.athletisch = athletisch;
		this.aufbauend = aufbauend;
		this.aufgeschlossen = aufgeschlossen;
		this.aufgeweckt = aufgeweckt;
		this.aufmerksam = aufmerksam;
		this.aufmunternd = aufmunternd;
		this.aufopferungsvoll = aufopferungsvoll;
		this.aufregend = aufregend;
		this.aufrichtig = aufrichtig;
		this.ausdauernd = ausdauernd;
		this.ausdrucksstark = ausdrucksstark;
		this.ausluenderfreundlich = ausluenderfreundlich;
		this.authentisch = authentisch;
		this.autonom = autonom;
		this.autorituer = autorituer;
		this.bedacht = bedacht;
		this.bedenkenlos = bedenkenlos;
		this.begabt = begabt;
		this.begeisterungsfuehig = begeisterungsfuehig;
		this.begnuegsam = begnuegsam;
		this.beherzt = beherzt;
		this.behutsam = behutsam;
		this.belastbar = belastbar;
		this.belesen = belesen;
		this.beliebt = beliebt;
		this.bemutternd = bemutternd;
		this.bescheiden = bescheiden;
		this.beschuetzerisch = beschuetzerisch;
		this.bestuendig = bestuendig;
		this.beweglich = beweglich;
		this.bodenstuendig = bodenstuendig;
		this.brav = brav;
		this.bruederlich = bruederlich;
		this.buerokratisch = buerokratisch;
		this.burschikos = burschikos;
		this.chaotisch = chaotisch;
		this.charakterstark = charakterstark;
		this.charismatisch = charismatisch;
		this.charmant = charmant;
		this.clever = clever;
		this.couragiert = couragiert;
		this.damenhaft = damenhaft;
		this.dankbar = dankbar;
		this.defensiv = defensiv;
		this.detailverliebt = detailverliebt;
		this.diplomatisch = diplomatisch;
		this.direkt = direkt;
		this.diskret = diskret;
		this.diskussionsfreudig = diskussionsfreudig;
		this.diszipliniert = diszipliniert;
		this.durchsetzungsstark = durchsetzungsstark;
		this.dusselig = dusselig;
		this.dynamisch = dynamisch;
		this.effizient = effizient;
		this.ehrenhaft = ehrenhaft;
		this.ehrfuerchtig = ehrfuerchtig;
		this.ehrgeizig = ehrgeizig;
		this.ehrlich = ehrlich;
		this.eifrig = eifrig;
		this.eigenbestimmt = eigenbestimmt;
		this.eigenstuendig = eigenstuendig;
		this.einfach = einfach;
		this.einfallsreich = einfallsreich;
		this.einfuehlsam = einfuehlsam;
		this.einzelguengerisch = einzelguengerisch;
		this.elegant = elegant;
		this.emotional = emotional;
		this.emotionslos = emotionslos;
		this.empathisch = empathisch;
		this.engagiert = engagiert;
		this.enthaltsam = enthaltsam;
		this.enthusiastisch = enthusiastisch;
		this.erfinderisch = erfinderisch;
		this.erfolgreich = erfolgreich;
		this.erfolgsorientiert = erfolgsorientiert;
		this.ernst = ernst;
		this.fantasievoll = fantasievoll;
		this.feinfuehlig = feinfuehlig;
		this.feminin = feminin;
		this.feministisch = feministisch;
		this.feurig = feurig;
		this.fleiueig = fleiueig;
		this.flexibel = flexibel;
		this.freiheitsliebend = freiheitsliebend;
		this.freundlich = freundlich;
		this.friedliebend = friedliebend;
		this.gastfreundlich = gastfreundlich;
		this.gebildet = gebildet;
		this.geduldig = geduldig;
		this.gefuehlvoll = gefuehlvoll;
		this.genau = genau;
		this.genauigkeitsliebend = genauigkeitsliebend;
		this.genuegsam = genuegsam;
		this.gerechtigkeitsliebend = gerechtigkeitsliebend;
		this.gescheit = gescheit;
		this.geschickt = geschickt;
		this.gesellig = gesellig;
		this.gespruechig = gespruechig;
		this.gesundheitsbewusst = gesundheitsbewusst;
		this.gewissenhaft = gewissenhaft;
		this.glaubensstark = glaubensstark;
		this.gruendlich = gruendlich;
		this.guetig = guetig;
		this.gutherzig = gutherzig;
		this.harmoniebeduerftig = harmoniebeduerftig;
		this.hartnueckig = hartnueckig;
		this.hilfsbereit = hilfsbereit;
		this.hingebungsvoll = hingebungsvoll;
		this.hochbegabt = hochbegabt;
		this.hueflich = hueflich;
		this.humorvoll = humorvoll;
		this.idealistisch = idealistisch;
		this.ideenreich = ideenreich;
		this.initiativ = initiativ;
		this.intelligent = intelligent;
		this.interessiert = interessiert;
		this.introvertiert = introvertiert;
		this.jugendlich = jugendlich;
		this.kuempferisch = kuempferisch;
		this.kinderlieb = kinderlieb;
		this.kindisch = kindisch;
		this.kindlich = kindlich;
		this.kompromissbereit = kompromissbereit;
		this.konfliktfreudig = konfliktfreudig;
		this.konfliktscheu = konfliktscheu;
		this.kontaktfreudig = kontaktfreudig;
		this.kreativ = kreativ;
		this.kritikfuehig = kritikfuehig;
		this.kuenstlerisch = kuenstlerisch;
		this.kultiviert = kultiviert;
		this.kumpelhaft = kumpelhaft;
		this.kurios = kurios;
		this.lebhaft = lebhaft;
		this.leidenschaftlich = leidenschaftlich;
		this.lernbereit = lernbereit;
		this.liebevoll = liebevoll;
		this.lustig = lustig;
		this.lustvoll = lustvoll;
		this.menschenfreundlich = menschenfreundlich;
		this.mitfuehlend = mitfuehlend;
		this.modebewusst = modebewusst;
		this.muetterlich = muetterlich;
		this.musikalisch = musikalisch;
		this.nachdenklich = nachdenklich;
		this.nuehesuchend = nuehesuchend;
		this.naturverbunden = naturverbunden;
		this.neugierig = neugierig;
		this.neutral = neutral;
		this.objektiv = objektiv;
		this.offen = offen;
		this.ordentlich = ordentlich;
		this.ordnungsliebend = ordnungsliebend;
		this.perfektionistisch = perfektionistisch;
		this.pflichtbewusst = pflichtbewusst;
		this.phantasievoll = phantasievoll;
		this.planend = planend;
		this.problemluesend = problemluesend;
		this.querdenkend = querdenkend;
		this.quirlig = quirlig;
		this.rational = rational;
		this.redselig = redselig;
		this.reiselustig = reiselustig;
		this.religiues = religiues;
		this.respektvoll = respektvoll;
		this.romantisch = romantisch;
		this.ruecksichtsvoll = ruecksichtsvoll;
		this.ruhig = ruhig;
		this.sachlich = sachlich;
		this.schuechtern = schuechtern;
		this.selbstkritisch = selbstkritisch;
		this.selbstreflektierend = selbstreflektierend;
		this.sensibel = sensibel;
		this.sparsam = sparsam;
		this.spirituell = spirituell;
		this.spontan = spontan;
		this.sportlich = sportlich;
		this.sprachbegabt = sprachbegabt;
		this.strategisch = strategisch;
		this.streng = streng;
		this.teamfuehig = teamfuehig;
		this.temperamentvoll = temperamentvoll;
		this.tiefgruendig = tiefgruendig;
		this.tierlieb = tierlieb;
		this.tolerant = tolerant;
		this.treuherzig = treuherzig;
		this.tuechtig = tuechtig;
		this.unternehmungsfreudig = unternehmungsfreudig;
		this.unternehmungslustig = unternehmungslustig;
		this.unterstuetzend = unterstuetzend;
		this.vueterlich = vueterlich;
		this.verantwortungsvoll = verantwortungsvoll;
		this.verluesslich = verluesslich;
		this.verstuendnisvoll = verstuendnisvoll;
		this.vertrauenswuerdig = vertrauenswuerdig;
		this.vielschichtig = vielschichtig;
		this.weltoffen = weltoffen;
		this.werteorientiert = werteorientiert;
		this.willensstark = willensstark;
		this.wissbegierig = wissbegierig;
		this.wortgewandt = wortgewandt;
		this.wortkarg = wortkarg;
		this.zielstrebig = zielstrebig;
		this.zukunftsorientiert = zukunftsorientiert;
		this.zuverluessig = zuverluessig;
		this.zuversichtlich = zuversichtlich;
		this.zuvorkommend = zuvorkommend;
	}



}
