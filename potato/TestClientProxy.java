package potato;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBoat;
import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderTNTPrimed;
import net.minecraft.client.renderer.texture.TextureObject;
import net.minecraft.models.ModelAbbyDemon;
import net.minecraft.models.ModelAhrim;
import net.minecraft.models.ModelAkrisae;
import net.minecraft.models.ModelBandosArm;
import net.minecraft.models.ModelBlackDemon;
import net.minecraft.models.ModelCaveCrawler;
import net.minecraft.models.ModelDharok;
import net.minecraft.models.ModelFireGiant;
import net.minecraft.models.ModelGeneralGraardor;
import net.minecraft.models.ModelGhost;
import net.minecraft.models.ModelGoblin;
import net.minecraft.models.ModelGreenDragon;
import net.minecraft.models.ModelGuthan;
import net.minecraft.models.ModelHellhound;
import net.minecraft.models.ModelHillGiant;
import net.minecraft.models.ModelIceGiant;
import net.minecraft.models.ModelKaril;
import net.minecraft.models.ModelLavaBlock;
import net.minecraft.models.ModelLesserDemon;
import net.minecraft.models.ModelLesserDemon2;
import net.minecraft.models.ModelLootChest;
import net.minecraft.models.ModelMossGiant;
import net.minecraft.models.ModelRat;
import net.minecraft.models.ModelSergeantGrimSpike;
import net.minecraft.models.ModelSergeantSteelWill;
import net.minecraft.models.ModelSergeantStrongStack;
import net.minecraft.models.ModelTD;
import net.minecraft.models.ModelTorag;
import net.minecraft.models.ModelVerac;
import net.minecraft.models.ModelScorpion;
import net.minecraft.models.ModelDwarf;
import net.minecraft.src.*;
import net.minecraft.models.ModelBot;
import net.minecraft.models.ModelKQ;
import net.minecraft.models.ModelKQ2;
import net.minecraft.models.ModelMagicBoat;
import net.minecraft.src.RenderAbbyDemon;
import net.minecraft.src.RenderBot;
import net.minecraft.src.RenderGoblin;
import net.minecraft.src.RenderDwarf;
import net.minecraft.src.RenderGreenDragon;
import net.minecraft.src.RenderHellhound;
import net.minecraft.src.RenderIceGiant;
import net.minecraft.src.RenderIronDragon;
import net.minecraft.src.RenderKQ;
import net.minecraft.src.RenderKQ2;
import net.minecraft.src.RenderLesserDemon;
import net.minecraft.src.RenderLesserDemon2;
import net.minecraft.src.RenderMagicBoat;
import net.minecraft.src.RenderRatSmall;
import net.minecraft.src.RenderScorpion;
import net.minecraft.src.mod_BlocksGalore;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.client.MinecraftForgeClient;

public class TestClientProxy extends TestCommonProxy
{
 
	private static final ModelBandosArm tutChest = new ModelBandosArm(1.0f);
	private static final ModelBandosArm tutLegs = new ModelBandosArm(0.5f);

	@Override
	public ModelBiped getArmorModel(int id){
	switch (id) {
	case 0:
	return tutChest;
	case 1:
	return tutLegs;
	default:
	break;
	}
	return tutChest; //default, if whenever you should have passed on a wrong id
	}
	
	public static void addModerCapes() {

		String capeURL = "http://i.imgur.com/ZT124P8.png";
		String[] devs = {"999134fishy"};

		ThreadDownloadImageData image = new ThreadDownloadImageData(capeURL, null, null);

		for (String username : devs) {

		Minecraft.getMinecraft().renderEngine.loadTexture(new ResourceLocation("cloaks/" + username), (TextureObject) image);
		}
		}
	
	@Override
public void registerRenderThings()
{
		 
 
RenderingRegistry.instance().registerEntityRenderingHandler(EntityKQ.class, new RenderKQ(new ModelKQ(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityKQ2.class, new RenderKQ2(new ModelKQ2(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityLesserDemon.class, new RenderLesserDemon(new ModelLesserDemon(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityGoblin.class, new RenderGoblin(new ModelGoblin(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityScorpion.class, new RenderScorpion(new ModelScorpion(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityAbbyDemon.class, new RenderAbbyDemon(new ModelAbbyDemon(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityGreenDragon.class, new RenderGreenDragon(new ModelGreenDragon(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityDwarf.class, new RenderDwarf(new ModelDwarf(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityIceGiant.class, new RenderIceGiant(new ModelIceGiant(), 0.5F));	  
RenderingRegistry.instance().registerEntityRenderingHandler(EntityIronDragon.class, new RenderIronDragon(new ModelGreenDragon(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityHellhound.class, new RenderHellhound(new ModelHellhound(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityLesserDemon2.class, new RenderLesserDemon2(new ModelLesserDemon2(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityBlackDragon.class, new RenderBlackDragon(new ModelGreenDragon(), 0.5F));


RenderingRegistry.instance().registerEntityRenderingHandler(EntityBot.class, new RenderBot(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityBot2.class, new RenderBot2(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityBot3.class, new RenderBot3(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityTheif.class, new RenderTheif(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityBlackKnight.class, new RenderBlackKnight(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityWhiteKnight.class, new RenderWhiteKnight(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityHeroKnight.class, new RenderHeroKnight(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityGuard.class, new RenderGuard(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityWizard.class, new RenderWizard(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityDarkwizard.class, new RenderDarkwizard(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityHighMage.class, new RenderHighMage(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityKing.class, new RenderKing(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityKingsGuard.class, new RenderKingsGuard(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityEliteBlackKnight.class, new RenderEliteBlackKnight(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityBarbarian.class, new RenderBarbarian(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityShopKeeper.class, new RenderShopKeeper(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityVampire.class, new RenderVampire(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityDoctor.class, new RenderDoctor(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityMan.class, new RenderMan(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityMorgan.class, new RenderMorgan(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityCook.class, new RenderCook(new ModelBiped(), 0.5F));


RenderingRegistry.instance().registerEntityRenderingHandler(EntityGeneralGraardor.class, new RenderGeneralGraardor(new ModelGeneralGraardor(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntitySergeantGrimspike.class, new RenderSergeantGrimspike(new ModelSergeantGrimSpike(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntitySergeantSteelwill.class, new RenderSergeantSteelwill(new ModelSergeantSteelWill(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntitySergeantStrongstack.class, new RenderSergeantStrongstack(new ModelSergeantStrongStack(), 0.5F));

RenderingRegistry.instance().registerEntityRenderingHandler(EntityDharok.class, new RenderDharok(new ModelDharok(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityTorag.class, new RenderTorag(new ModelTorag(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityVerac.class, new RenderVerac(new ModelVerac(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityGuthan.class, new RenderGuthan(new ModelGuthan(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityKaril.class, new RenderKaril(new ModelKaril(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityAkrisae.class, new RenderAkrisae(new ModelAkrisae(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityAhrim.class, new RenderAhrim(new ModelAhrim(), 0.5F));

RenderingRegistry.instance().registerEntityRenderingHandler(EntityFarmer.class, new RenderFarmer(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityRat.class, new RenderRat(new ModelRat(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityRatSmall.class, new RenderRatSmall(new ModelRat(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityTD.class, new RenderTD(new ModelTD(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityMossGiant.class, new RenderMossGiant(new ModelMossGiant(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityHillGiant.class, new RenderHillGiant(new ModelHillGiant(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityFireGiant.class, new RenderFireGiant(new ModelFireGiant(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityCaveCrawler.class, new RenderCaveCrawler(new ModelCaveCrawler(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityBlackDemon.class, new RenderBlackDemon(new ModelBlackDemon(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityGhost.class, new RenderGhost(new ModelGhost(), 0.5F));


RenderingRegistry.instance().registerEntityRenderingHandler(EntityKos1.class, new RenderKos1(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityKos2.class, new RenderKos2(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityKos3.class, new RenderKos3(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityKos4.class, new RenderKos4(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityFremGuard.class, new RenderFremGuard(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityBlackGuard.class, new RenderBlackGuard(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityVarze.class, new RenderVarze(new ModelBiped(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityBlackGuard2.class, new RenderBlackGuard2(new ModelBiped(), 0.5F));


RenderingRegistry.instance().registerEntityRenderingHandler(EntityLavaBlock.class, new RenderLavaBlock(new ModelLavaBlock(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityLootChest.class, new RenderLootChest(new ModelLootChest(), 0.5F));
RenderingRegistry.instance().registerEntityRenderingHandler(EntityTNTXPrimed.class, new RenderTNTPrimed());
RenderingRegistry.instance().registerEntityRenderingHandler(EntityTinyTNTPrimed.class, new RenderTNTPrimed());


MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.DBA.itemID,(IItemRenderer) new ItemRenderDBA());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.DDS.itemID,(IItemRenderer) new ItemRenderDDS());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.DD.itemID,(IItemRenderer) new ItemRenderDD());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.RAPIER.itemID,(IItemRenderer) new ItemRenderRAPIER());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.Sarastaff.itemID,(IItemRenderer) new ItemRenderSARASTAFF());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.Zammystaff.itemID,(IItemRenderer) new ItemRenderZAMMYSTAFF());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.Guthixstaff.itemID,(IItemRenderer) new ItemRenderGUTHIXSTAFF());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.Whip.itemID,(IItemRenderer) new ItemRenderWhip());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.BGS.itemID,(IItemRenderer) new ItemRenderBGS());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.ZGS.itemID,(IItemRenderer) new ItemRenderZGS());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.AGS.itemID,(IItemRenderer) new ItemRenderAGS());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.SGS.itemID,(IItemRenderer) new ItemRenderSGS());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.SteelHammer.itemID,(IItemRenderer) new ItemRenderSteelHammer());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.MithHammer.itemID,(IItemRenderer) new ItemRenderMithHammer());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.AddyHammer.itemID,(IItemRenderer) new ItemRenderAddyHammer());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.RuneHammer.itemID,(IItemRenderer) new ItemRenderRuneHammer());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.sarasword.itemID,(IItemRenderer) new ItemRenderSaraSword());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.ToragHammer.itemID,(IItemRenderer) new ItemRenderToragHammer());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.VeracFlail.itemID,(IItemRenderer) new ItemRenderVeracFlail());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.GuthanSpear.itemID,(IItemRenderer) new ItemRenderGuthanSpear());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.DharokAxe.itemID,(IItemRenderer) new ItemRenderDharokAxe());
MinecraftForgeClient.registerItemRenderer(mod_MagicBow.KarilBow.itemID,(IItemRenderer) new ItemRenderKarilBow());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.AhrimStaff.itemID,(IItemRenderer) new ItemRenderAhrimStaff());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.AkrisaeMace.itemID,(IItemRenderer) new ItemRenderAkrisaeMace());
MinecraftForgeClient.registerItemRenderer(mod_MagicBow.DarkBow.itemID,(IItemRenderer) new ItemRenderDarkBow());

MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.PitchFork.itemID,(IItemRenderer) new ItemRenderPitchFork());
MinecraftForgeClient.registerItemRenderer(mod_BlocksGalore.BlackHalberd.itemID,(IItemRenderer) new ItemRenderBlackHalberd());

ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFireEntity.class, new TileEntityFireRenderer());
ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStallEntity.class, new TileStallRenderer());
ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBlockStallEntity.class, new TileEntityBlockStallRenderer());

		RenderingRegistry.registerEntityRenderingHandler(EntityMagicBoat.class, new RenderMagicBoat());
	
	}
//These are the texture files with the item/block textures
}

