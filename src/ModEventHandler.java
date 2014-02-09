package net.minecraft.src;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.EventPriority;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class ModEventHandler {
//	ExtendedPlayer extendedPlayer = null;

	public void load(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new ModEventHandler());
	}

	@ForgeSubscribe
	public void onEntityConstructing(EntityConstructing event) {
		if (event.entity instanceof EntityPlayer
				&& ExtendedPlayer.get((EntityPlayer) event.entity) == null)
			// This is how extended properties are registered using our
			// convenient method from earlier
			ExtendedPlayer.register((EntityPlayer) event.entity);
		// That will call the constructor as well as cause the init() method
		// to be called automatically

		if (event.entity instanceof EntityPlayer
				&& event.entity
						.getExtendedProperties(ExtendedPlayer.EXT_PROP_NAME) == null) {
			//System.out.println("making ExtendedPlayer");
			ExtendedPlayer extendedPlayer = new ExtendedPlayer((EntityPlayer) event.entity);
			event.entity.registerExtendedProperties(
					ExtendedPlayer.EXT_PROP_NAME, extendedPlayer);
		}
		
	
	}

//	@ForgeSubscribe
//	public void onItemPickup(EntityItemPickupEvent event) {
//		if (event.entity instanceof EntityPlayer) {
//			if (event.item.getEntityItem().getItem() == mod_Flower.XPORB) {
//
//				ExtendedPlayer.get(event.entityPlayer).addXp(1);
//				//System.out.println("xp gained");
//			}
///		}
//		if (event.entity instanceof EntityPlayer) {
//			if (event.item.getEntityItem().getItem() == mod_Flower.BXPORB) {
//				ExtendedPlayer.get(event.entityPlayer).addXp(3);
//			}
//		}
//		if (event.entity instanceof EntityPlayer) {
//			if (event.item.getEntityItem().getItem() == mod_Flower.HAXXPORB) {
//				ExtendedPlayer.get(event.entityPlayer).addXp(99999);
//			}
//		}
//	}

	@ForgeSubscribe(priority=EventPriority.LOWEST)
	public void onNameFormat(PlayerEvent.NameFormat event) {
	//	if (extendedPlayer != null) {
		ExtendedPlayer props = ExtendedPlayer.get(event.entityPlayer);
			if (props.getCombatxp() >= 0*2 && props.getCombatxp() < 5*2) {event.displayname = event.displayname + "\u00a7E[1]\u00A7f";}
			else if (props.getCombatxp() >= 5*2 && props.getCombatxp() < 15*2) {event.displayname = event.displayname + "\u00a7E[2]\u00A7f";}
			else if (props.getCombatxp() >= 15*2 && props.getCombatxp() < 30*2) {event.displayname = event.displayname + "\u00a7E[3]\u00A7f";}
			else if (props.getCombatxp() >= 30*2 && props.getCombatxp() < 50*2) {event.displayname = event.displayname + "\u00a7E[4]\u00A7f";}
			else if (props.getCombatxp() >= 50*2 && props.getCombatxp() < 75*2) {event.displayname = event.displayname + "\u00a7E[5]\u00A7f";}
			else if (props.getCombatxp() >= 75*2 && props.getCombatxp() < 90*2) {event.displayname = event.displayname + "\u00a7E[6]\u00A7f";}
			else if (props.getCombatxp() >= 90*2 && props.getCombatxp() < 112*2) {event.displayname = event.displayname + "\u00a7E[7]\u00A7f";}
			else if (props.getCombatxp() >= 112*2 && props.getCombatxp() < 124*2) {event.displayname = event.displayname + "\u00a7E[8]\u00A7f";}
			else if (props.getCombatxp() >= 124*2 && props.getCombatxp() < 138*2) {event.displayname = event.displayname + "\u00a7E[9]\u00A7f";}
			else if (props.getCombatxp() >= 138*2 && props.getCombatxp() < 151*2) {event.displayname = event.displayname + "\u00a7E[10]\u00A7f";}
			else if (props.getCombatxp() >= 151*2 && props.getCombatxp() < 168*2) {event.displayname = event.displayname + "\u00a7E[11]\u00A7f";}
			else if (props.getCombatxp() >= 168*2 && props.getCombatxp() < 185*2) {event.displayname = event.displayname + "\u00a7E[12]\u00A7f";}
			else if (props.getCombatxp() >= 185*2 && props.getCombatxp() < 204*2) {event.displayname = event.displayname + "\u00a7E[13]\u00A7f";}
			else if (props.getCombatxp() >= 204*2 && props.getCombatxp() < 226*2) {event.displayname = event.displayname + "\u00a7E[14]\u00A7f";}
			else if (props.getCombatxp() >= 226*2 && props.getCombatxp() < 249*2) {event.displayname = event.displayname + "\u00a7E[15]\u00A7f";}
			else if (props.getCombatxp() >= 498 && props.getCombatxp() < 600) {event.displayname = event.displayname + "\u00a7E[16]\u00A7f";}
			else if (props.getCombatxp() >= 600 && props.getCombatxp() < 720) {event.displayname = event.displayname + "\u00a7E[17]\u00A7f";}
			else if (props.getCombatxp() >= 720 && props.getCombatxp() < 850) {event.displayname = event.displayname + "\u00a7E[18]\u00A7f";}
			else if (props.getCombatxp() >= 850 && props.getCombatxp() < 950) {event.displayname = event.displayname + "\u00a7E[19]\u00A7f";}
			else if (props.getCombatxp() >= 950 && props.getCombatxp() < 1060) {event.displayname = event.displayname + "\u00a7E[20]\u00A7f";}
			else if (props.getCombatxp() >= 1060 && props.getCombatxp() < 1200) {event.displayname = event.displayname + "\u00a7E[21]\u00A7f";}
			else if (props.getCombatxp() >= 1200 && props.getCombatxp() < 1700) {event.displayname = event.displayname + "\u00a7E[22]\u00A7f";}
			else if (props.getCombatxp() >= 1700 && props.getCombatxp() < 2300) {event.displayname = event.displayname + "\u00a7E[23]\u00A7f";}
			else if (props.getCombatxp() >= 2300 && props.getCombatxp() < 3000) {event.displayname = event.displayname + "\u00a7E[24]\u00A7f";}
			else if (props.getCombatxp() >= 3000 && props.getCombatxp() < 3800) {event.displayname = event.displayname + "\u00a7E[25]\u00A7f";}
			else if (props.getCombatxp() >= 3800 && props.getCombatxp() < 4700) {event.displayname = event.displayname + "\u00a7E[26]\u00A7f";}
			else if (props.getCombatxp() >= 4700 && props.getCombatxp() < 6100) {event.displayname = event.displayname + "\u00a7E[27]\u00A7f";}
			else if (props.getCombatxp() >= 6100 && props.getCombatxp() < 7320) {event.displayname = event.displayname + "\u00a7E[28]\u00A7f";}
			else if (props.getCombatxp() >= 7320 && props.getCombatxp() < 8784) {event.displayname = event.displayname + "\u00a7E[29]\u00A7f";}
			else if (props.getCombatxp() >= 8784 && props.getCombatxp() < 10540) {event.displayname = event.displayname + "\u00a7E[30]\u00A7f";}
			else if (props.getCombatxp() >= 10540 && props.getCombatxp() < 12648) {event.displayname = event.displayname + "\u00a7E[31]\u00A7f";}
			else if (props.getCombatxp() >= 12648 && props.getCombatxp() < 15178) {event.displayname = event.displayname + "\u00a7E[32]\u00A7f";}
			else if (props.getCombatxp() >= 15178 && props.getCombatxp() < 18214) {event.displayname = event.displayname + "\u00a7E[33]\u00A7f";}
			else if (props.getCombatxp() >= 18214 && props.getCombatxp() < 21857) {event.displayname = event.displayname + "\u00a7E[34]\u00A7f";}
			else if (props.getCombatxp() >= 21857 && props.getCombatxp() < 26228) {event.displayname = event.displayname + "\u00a7E[35]\u00A7f";}
			else if (props.getCombatxp() >= 26228 && props.getCombatxp() < 31474) {event.displayname = event.displayname + "\u00a7E[36]\u00A7f";}
			else if (props.getCombatxp() >= 31474 && props.getCombatxp() < 37769) {event.displayname = event.displayname + "\u00a7E[37]\u00A7f";}
			else if (props.getCombatxp() >= 37769 && props.getCombatxp() < 45323) {event.displayname = event.displayname + "\u00a7E[38]\u00A7f";}
			else if (props.getCombatxp() >= 45323 && props.getCombatxp() < 54388) {event.displayname = event.displayname + "\u00a7E[39]\u00A7f";}
			else if (props.getCombatxp() >= 54388 && props.getCombatxp() < 65265) {event.displayname = event.displayname + "\u00a7E[40]\u00A7f";}
			else if (props.getCombatxp() >= 65265 && props.getCombatxp() < 78319) {event.displayname = event.displayname + "\u00a7E[41]\u00A7f";}
			else if (props.getCombatxp() >= 78319 && props.getCombatxp() < 93982) {event.displayname = event.displayname + "\u00a7E[42]\u00A7f";}
			else if (props.getCombatxp() >= 93982 && props.getCombatxp() < 112779) {event.displayname = event.displayname + "\u00a7E[43]\u00A7f";}
			else if (props.getCombatxp() >= 112779 && props.getCombatxp() < 135335) {event.displayname = event.displayname + "\u00a7E[44]\u00A7f";}
			else if (props.getCombatxp() >= 135335 && props.getCombatxp() < 162402) {event.displayname = event.displayname + "\u00a7E[45]\u00A7f";}
			else if (props.getCombatxp() >= 162402 && props.getCombatxp() < 194822) {event.displayname = event.displayname + "\u00a7E[46]\u00A7f";}
			else if (props.getCombatxp() >= 194822 && props.getCombatxp() < 233859) {event.displayname = event.displayname + "\u00a7E[47]\u00A7f";}
			else if (props.getCombatxp() >= 280631 && props.getCombatxp() < 280631) {event.displayname = event.displayname + "\u00a7E[48]\u00A7f";}
			else if (props.getCombatxp() >= 336757 && props.getCombatxp() < 336757) {event.displayname = event.displayname + "\u00a7E[49]\u00A7f";}
			else if (props.getCombatxp() >= 336757) {event.displayname = event.displayname + "\u00A7C[50]\u00A7f";}
			
		}
	

	
	
	@ForgeSubscribe
	public void onLivingUpdateEvent(LivingUpdateEvent event) {
		// if (playerName == "")
		// {
		// player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(100.0D);
		// }
		// }

		if (event.entity instanceof EntityPlayer) {

		EntityPlayer player = (EntityPlayer) event.entity;
		ExtendedPlayer props1 = ExtendedPlayer.get(player);	
		ExtendedPlayer propsa = ExtendedPlayer.get(player);	
		for (ItemStack stack : player.inventory.mainInventory) {
			if (props1.getCombatxp() <  21857){
			if (stack != null&& stack.itemID == mod_Flower.Stall.blockID) {stack.itemID = Block.dirt.blockID;
			player.addChatMessage("\u00a7EYou must be level 35 to place this");}
			if (stack != null&& stack.itemID == mod_Flower.Fire.blockID) {stack.itemID = Block.dirt.blockID;
			player.addChatMessage("\u00a7EYou must be level 35 to place this");}
			}}
	//		if (stack != null&& stack.itemID == mod_Flower.BXPORB.itemID) {stack.itemID = Block.grass.blockID;}
	//		}
//
		if (propsa.getAgilityxp() > 138*2){
			player.addPotionEffect(new PotionEffect(
					Potion.jump.id, 50, 0));
		}
		if (propsa.getAgilityxp() > 226*2){
			player.addPotionEffect(new PotionEffect(
					Potion.moveSpeed.id, 50, 0));
		}
		if (propsa.getAgilityxp() > 950){
			player.addPotionEffect(new PotionEffect(
					Potion.jump.id, 50, 1));
		}
		if (propsa.getAgilityxp() > 3000){
			player.addPotionEffect(new PotionEffect(
					Potion.moveSpeed.id, 50, 1));
		}
		
		
			ItemStack boots = player.getCurrentItemOrArmor(1);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack helmet = player.getCurrentItemOrArmor(4);
			if (boots == null | legs == null | chest == null | helmet == null) {
				player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
						.setAttribute(20.0D);
				if (player.getHealth() > 20.0F) {
					player.setHealth(20.0F);
				}
			}
			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.DharokBoots
						&& legs.getItem() == mod_phat.DharokLeggings
						&& chest.getItem() == mod_phat.DharokChestplate
						&& helmet.getItem() == mod_phat.DharokHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(50.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.ToragBoots
						&& legs.getItem() == mod_phat.ToragLeggings
						&& chest.getItem() == mod_phat.ToragChestplate
						&& helmet.getItem() == mod_phat.ToragHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(50.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.AhrimBoots
						&& legs.getItem() == mod_phat.AhrimLeggings
						&& chest.getItem() == mod_phat.AhrimChestplate
						&& helmet.getItem() == mod_phat.AhrimHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(50.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.AkrisaeBoots
						&& legs.getItem() == mod_phat.AkrisaeLeggings
						&& chest.getItem() == mod_phat.AkrisaeChestplate
						&& helmet.getItem() == mod_phat.AkrisaeHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(50.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.VeracBoots
						&& legs.getItem() == mod_phat.VeracLeggings
						&& chest.getItem() == mod_phat.VeracChestplate
						&& helmet.getItem() == mod_phat.VeracHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(50.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.GuthanBoots
						&& legs.getItem() == mod_phat.GuthanLeggings
						&& chest.getItem() == mod_phat.GuthanChestplate
						&& helmet.getItem() == mod_phat.GuthanHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(50.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.KarilBoots
						&& legs.getItem() == mod_phat.KarilLeggings
						&& chest.getItem() == mod_phat.KarilChestplate
						&& helmet.getItem() == mod_phat.KarilHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(50.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.whiteBoots
						&& legs.getItem() == mod_phat.whiteLeggings
						&& chest.getItem() == mod_phat.whiteChestplate
						&& helmet.getItem() == mod_phat.whiteHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(26.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.blackBoots
						&& legs.getItem() == mod_phat.blackLeggings
						&& chest.getItem() == mod_phat.blackChestplate
						&& helmet.getItem() == mod_phat.blackHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(26.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.mithBoots
						&& legs.getItem() == mod_phat.mithLeggings
						&& chest.getItem() == mod_phat.mithChestplate
						&& helmet.getItem() == mod_phat.mithHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(30.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.addyBoots
						&& legs.getItem() == mod_phat.addyLeggings
						&& chest.getItem() == mod_phat.addyChestplate
						&& helmet.getItem() == mod_phat.addyHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(34.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.runeBoots
						&& legs.getItem() == mod_phat.runeLeggings
						&& chest.getItem() == mod_phat.runeChestplate
						&& helmet.getItem() == mod_phat.runeHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(40.0D);
				}
			}


			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.graniteBoots
						&& legs.getItem() == mod_phat.graniteLeggings
						&& chest.getItem() == mod_phat.graniteChestplate
						&& helmet.getItem() == mod_phat.graniteHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(45.0D);
				}
			}
			
			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.dragonBoots
						&& legs.getItem() == mod_phat.dragonLeggings
						&& chest.getItem() == mod_phat.dragonChestplate
						&& helmet.getItem() == mod_phat.dragonHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(50.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.cdragonBoots
						&& legs.getItem() == mod_phat.cdragonLeggings
						&& chest.getItem() == mod_phat.cdragonChestplate
						&& helmet.getItem() == mod_phat.cdragonHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(44.0D);
				}
			}
			
			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.dragonlBoots
						&& legs.getItem() == mod_phat.dragonlLeggings
						&& chest.getItem() == mod_phat.dragonlChestplate
						&& helmet.getItem() == mod_phat.dragonlHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(58.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.runegBoots
						&& legs.getItem() == mod_phat.runegLeggings
						&& chest.getItem() == mod_phat.runegChestplate
						&& helmet.getItem() == mod_phat.runegHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(40.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.blackgBoots
						&& legs.getItem() == mod_phat.blackgLeggings
						&& chest.getItem() == mod_phat.blackgChestplate
						&& helmet.getItem() == mod_phat.blackgHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(36.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.boots
						
						&& chest.getItem() == mod_phat.chest
						&& helmet.getItem() == mod_phat.helmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(40.0D);
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.greendBoots
						&& legs.getItem() == mod_phat.greendLeggings
						&& chest.getItem() == mod_phat.greendChestplate
						&& helmet.getItem() == mod_phat.greendHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth)
							.setAttribute(28.0D);
					player.addPotionEffect(new PotionEffect(
							Potion.moveSpeed.id, 50, 0));
				}
			}

			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.blackdBoots && legs.getItem() == mod_phat.blackdLeggings && chest.getItem() == mod_phat.blackdChestplate && helmet.getItem() == mod_phat.blackdHelmet) {
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(34.0D);
					player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 50, 1));}}
			
			if (boots != null && legs != null && chest != null
					&& helmet != null){
				ExtendedPlayer props = ExtendedPlayer.get(player);		
				if (props.getCombatxp() < 3000){
					if (boots.getItem() == mod_phat.DharokBoots|| legs.getItem() == mod_phat.DharokLeggings|| chest.getItem() == mod_phat.DharokChestplate|| helmet.getItem() == mod_phat.DharokHelmet
					||boots.getItem() == mod_phat.VeracBoots|| legs.getItem() == mod_phat.VeracLeggings|| chest.getItem() == mod_phat.VeracChestplate|| helmet.getItem() == mod_phat.VeracHelmet
					||boots.getItem() == mod_phat.GuthanBoots|| legs.getItem() == mod_phat.GuthanLeggings|| chest.getItem() == mod_phat.GuthanChestplate|| helmet.getItem() == mod_phat.GuthanHelmet
					||boots.getItem() == mod_phat.KarilBoots|| legs.getItem() == mod_phat.KarilLeggings|| chest.getItem() == mod_phat.KarilChestplate|| helmet.getItem() == mod_phat.KarilHelmet
					||boots.getItem() == mod_phat.ToragBoots|| legs.getItem() == mod_phat.ToragLeggings|| chest.getItem() == mod_phat.ToragChestplate|| helmet.getItem() == mod_phat.ToragHelmet
					||boots.getItem() == mod_phat.AhrimBoots|| legs.getItem() == mod_phat.AhrimLeggings|| chest.getItem() == mod_phat.AhrimChestplate|| helmet.getItem() == mod_phat.AhrimHelmet
					||boots.getItem() == mod_phat.AkrisaeBoots|| legs.getItem() == mod_phat.AkrisaeLeggings|| chest.getItem() == mod_phat.AkrisaeChestplate|| helmet.getItem() == mod_phat.AkrisaeHelmet
					||boots.getItem() == mod_phat.boots|| legs.getItem() == mod_phat.legs|| chest.getItem() == mod_phat.chest|| helmet.getItem() == mod_phat.helmet){
					//player.addChatMessage("\u00a7EYou must be at least level 25 to use this armor");			
					//player.addChatMessage("\u00a7EYou need "+String.valueOf(2500-props.getCombatxp())+" more exp to use this item");
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(4.0D);}
					
					if (props.getCombatxp() < 10540){
						if (boots.getItem() == mod_phat.dragonlBoots|| legs.getItem() == mod_phat.dragonlLeggings|| chest.getItem() == mod_phat.dragonlChestplate|| helmet.getItem() == mod_phat.dragonlHelmet
					){//player.addChatMessage("\u00a7EYou must be at least level 30 to use this armor");			
					//player.addChatMessage("\u00a7EYou need "+String.valueOf(13337-props.getCombatxp())+" more exp to use this item");
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(4.0D);}
					}
					
					if (props.getCombatxp() < 950){
						if (boots.getItem() == mod_phat.dragonBoots|| legs.getItem() == mod_phat.dragonLeggings|| chest.getItem() == mod_phat.dragonChestplate|| helmet.getItem() == mod_phat.dragonHelmet
								||boots.getItem() == mod_phat.blackdBoots|| legs.getItem() == mod_phat.blackdLeggings|| chest.getItem() == mod_phat.blackdChestplate|| helmet.getItem() == mod_phat.blackdHelmet
								||boots.getItem() == mod_phat.graniteBoots|| legs.getItem() == mod_phat.graniteLeggings|| chest.getItem() == mod_phat.graniteChestplate|| helmet.getItem() == mod_phat.graniteHelmet){//player.addChatMessage("\u00a7EYou must be at least level 20 to use this armor");			
					//player.addChatMessage("\u00a7EYou need "+String.valueOf(850-props.getCombatxp())+" more exp to use this item");
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(4.0D);}
					}
							
					if (props.getCombatxp() < 452){
						if (boots.getItem() == mod_phat.runeBoots|| legs.getItem() == mod_phat.runeLeggings|| chest.getItem() == mod_phat.runeChestplate|| helmet.getItem() == mod_phat.runeHelmet
								||boots.getItem() == mod_phat.runegBoots|| legs.getItem() == mod_phat.runegLeggings|| chest.getItem() == mod_phat.runegChestplate|| helmet.getItem() == mod_phat.runegHelmet
								||boots.getItem() == mod_phat.blackgBoots|| legs.getItem() == mod_phat.blackgLeggings|| chest.getItem() == mod_phat.blackgChestplate|| helmet.getItem() == mod_phat.blackgHelmet
								||boots.getItem() == mod_phat.greendBoots|| legs.getItem() == mod_phat.greendLeggings|| chest.getItem() == mod_phat.greendChestplate|| helmet.getItem() == mod_phat.greendHelmet
								){//player.addChatMessage("\u00a7EYou must be at least level 15 to use this armor");			
					//player.addChatMessage("\u00a7EYou need "+String.valueOf(452-props.getCombatxp())+" more exp to use this item");
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(4.0D);}
					}	
					
					if (props.getCombatxp() < 276){
						if (boots.getItem() == mod_phat.addyBoots|| legs.getItem() == mod_phat.addyLeggings|| chest.getItem() == mod_phat.addyChestplate|| helmet.getItem() == mod_phat.addyHelmet
					){//			{player.addChatMessage("\u00a7EYou must be at least level 10 to use this armor");			
				//	player.addChatMessage("\u00a7EYou need "+String.valueOf(276-props.getCombatxp())+" more exp to use this item");
					player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(4.0D);}
					}
				}
			
			}
			
			
		}

		if (event.entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.entity;
			ItemStack heldItem = player.getHeldItem();
			if (heldItem != null
					&& heldItem.itemID == mod_BlocksGalore.AGS.itemID) {

				// player.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(22.0D);

				player.fallDistance = 0.0F;
			}
		}
		if (event.entity instanceof EntityBot) {EntityBot mob = (EntityBot) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityBot2) {EntityBot2 mob = (EntityBot2) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityBot3) {EntityBot3 mob = (EntityBot3) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityGuard) {EntityGuard mob = (EntityGuard) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityWizard) {EntityWizard mob = (EntityWizard) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityWhiteKnight) {EntityWhiteKnight mob = (EntityWhiteKnight) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityBlackKnight) {EntityBlackKnight mob = (EntityBlackKnight) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityAbbyDemon) {EntityAbbyDemon mob = (EntityAbbyDemon) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityGoblin) {EntityGoblin mob = (EntityGoblin) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityDwarf) {EntityDwarf mob = (EntityDwarf) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityTheif) {EntityTheif mob = (EntityTheif) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityHeroKnight) {EntityHeroKnight mob = (EntityHeroKnight) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityScorpion) {EntityScorpion mob = (EntityScorpion) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityLesserDemon) {EntityLesserDemon mob = (EntityLesserDemon) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityLesserDemon2) {EntityLesserDemon2 mob = (EntityLesserDemon2) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityIceGiant) {EntityIceGiant mob = (EntityIceGiant) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityIronDragon) {EntityIronDragon mob = (EntityIronDragon) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityGreenDragon) {EntityGreenDragon mob = (EntityGreenDragon) event.entity;mob.fallDistance = 0.0F;}
		if (event.entity instanceof EntityDarkwizard) {EntityDarkwizard mob = (EntityDarkwizard) event.entity;mob.fallDistance = 0.0F;}		
		}
	

	@ForgeSubscribe
	public void onHurt(LivingHurtEvent event) {
		if (event.source.getEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) event.source.getEntity();
			ItemStack boots = player.getCurrentItemOrArmor(1);
			ItemStack legs = player.getCurrentItemOrArmor(2);
			ItemStack chest = player.getCurrentItemOrArmor(3);
			ItemStack helmet = player.getCurrentItemOrArmor(4);
			// check each piece and add damage
			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (chest.getItem() == mod_phat.chest) {
					event.ammount += 5.0F; 
				}
				if (boots.getItem() == mod_phat.boots) {
					event.ammount += 3.0F; 
				}
				if (helmet.getItem() == mod_phat.helmet) {
					event.ammount += 2.0F;
				}

			}
			
			ExtendedPlayer props = ExtendedPlayer.get(player);		
			if (props.getCombatxp() < 3000){
			
				if(player.getHeldItem() != null){ 
				
			if (player.getHeldItem().itemID == mod_BlocksGalore.BGS.itemID || player.getHeldItem().itemID == mod_BlocksGalore.AGS.itemID || player.getHeldItem().itemID == mod_BlocksGalore.SGS.itemID || player.getHeldItem().itemID == mod_BlocksGalore.ZGS.itemID) {
				event.ammount -= 20.0F;
				player.addChatMessage("\u00a7EYou must be at least level 25 to use this item properly");			
				player.addChatMessage("\u00a7EYou need "+String.valueOf(3000-props.getCombatxp())+" more exp to use this item");}
			
			if (props.getCombatxp() < 950){
				if (player.getHeldItem().itemID == mod_BlocksGalore.dlong.itemID || player.getHeldItem().itemID == mod_BlocksGalore.DD.itemID || player.getHeldItem().itemID == mod_BlocksGalore.DDS.itemID || player.getHeldItem().itemID == mod_BlocksGalore.DBA.itemID
						|| player.getHeldItem().itemID == mod_BlocksGalore.Whip.itemID|| player.getHeldItem().itemID == mod_BlocksGalore.DragonScimmy.itemID|| player.getHeldItem().itemID == mod_BlocksGalore.Dragonaxe.itemID|| player.getHeldItem().itemID == mod_BlocksGalore.sarasword.itemID
						|| player.getHeldItem().itemID == mod_BlocksGalore.pickaxeGalore.itemID|| player.getHeldItem().itemID == mod_BlocksGalore.PickaxeGaloreg.itemID) {
					event.ammount -= 20.0F;
					player.addChatMessage("\u00a7EYou must be at least level 20 to use this item properly");			
					player.addChatMessage("\u00a7EYou need "+String.valueOf(950-props.getCombatxp())+" more exp to use this item");}
				}
			
			if (props.getCombatxp() < 452){
				if (player.getHeldItem().itemID == mod_BlocksGalore.Runesword.itemID || player.getHeldItem().itemID == mod_BlocksGalore.RuneHammer.itemID || player.getHeldItem().itemID == mod_BlocksGalore.korasis.itemID || player.getHeldItem().itemID == mod_BlocksGalore.keris.itemID) {
					event.ammount -= 20.0F;
					player.addChatMessage("\u00a7EYou must be at least level 15 to use this item properly");			
					player.addChatMessage("\u00a7EYou need "+String.valueOf(452-props.getCombatxp())+" more exp to use this item");}
				}
			
			if (props.getCombatxp() < 3000){
				if (player.getHeldItem().itemID == mod_BlocksGalore.ToragHammer.itemID || player.getHeldItem().itemID == mod_BlocksGalore.VeracFlail.itemID || player.getHeldItem().itemID == mod_BlocksGalore.GuthanSpear.itemID || player.getHeldItem().itemID == mod_BlocksGalore.DharokAxe.itemID|| player.getHeldItem().itemID == mod_BlocksGalore.AhrimStaff.itemID|| player.getHeldItem().itemID == mod_BlocksGalore.AkrisaeMace.itemID
						|| player.getHeldItem().itemID == mod_BlocksGalore.fremsword.itemID|| player.getHeldItem().itemID == mod_BlocksGalore.fremswordf.itemID|| player.getHeldItem().itemID == mod_BlocksGalore.RAPIER.itemID) {
					event.ammount -= 20.0F;
					player.addChatMessage("\u00a7EYou must be at least level 25 to use this item properly");			
					player.addChatMessage("\u00a7EYou need "+String.valueOf(3000-props.getCombatxp())+" more exp to use this item");}
				}
			
			if (props.getCombatxp() < 138*2){
				if (player.getHeldItem().itemID == mod_BlocksGalore.Addysword.itemID || player.getHeldItem().itemID == mod_BlocksGalore.AddyHammer.itemID) {
					event.ammount -= 10.0F;
					player.addChatMessage("\u00a7EYou must be at least level 10 to use this item properly");			
					player.addChatMessage("\u00a7EYou need "+String.valueOf(138*2-props.getCombatxp())+" more exp to use this item");}
				}
			
			if (props.getCombatxp() < 100){
				if (player.getHeldItem().itemID == mod_BlocksGalore.Mithsword.itemID || player.getHeldItem().itemID == mod_BlocksGalore.MithHammer.itemID || player.getHeldItem().itemID == Item.swordDiamond.itemID) {
					event.ammount -= 10.0F;
					player.addChatMessage("\u00a7EYou must be at least level 5 to use this item properly");			
					player.addChatMessage("\u00a7EYou need "+String.valueOf(100-props.getCombatxp())+" more exp to use this item");}
				}
		}}
		}
		
	}

	
	@ForgeSubscribe
	public void onAttackEntity(AttackEntityEvent event) {
		// I always do this, just easier to type for me
		EntityPlayer player = event.entityPlayer;

		// if the player's health is less than 5 (2.5 hearts) and holding your
		// item; you'll also need to check for all the other items, but I didn't
		// feel like typing that all out...
		if (player.getHealth() < 10.0F
				&& player.getHeldItem() != null
				&& player.getHeldItem().itemID == mod_BlocksGalore.chicken.itemID) {
			// this will cause 10 damage to the target
			event.target.attackEntityFrom(
					DamageSource.causePlayerDamage(player), 5.0F);
			player.motionY = 0.45D;
		}

		
		ItemStack boots = player.getCurrentItemOrArmor(1);
		ItemStack legs = player.getCurrentItemOrArmor(2);
		ItemStack chest = player.getCurrentItemOrArmor(3);
		ItemStack helmet = player.getCurrentItemOrArmor(4);

		if (player.getHealth() < 12.0F
				&& player.getHeldItem() != null
				&& player.getHeldItem().itemID == mod_BlocksGalore.DharokAxe.itemID) {
			if (boots != null && legs != null && chest != null
					&& helmet != null) {
				if (boots.getItem() == mod_phat.DharokBoots
						&& legs.getItem() == mod_phat.DharokLeggings
						&& chest.getItem() == mod_phat.DharokChestplate
						&& helmet.getItem() == mod_phat.DharokHelmet) {
					event.target.attackEntityFrom(
							DamageSource.causePlayerDamage(player), 35.0F);
					// player.motionY = 0.35D;
				}
			}

			if (player.getHealth() < 6.0F
					&& player.getHeldItem() != null
					&& player.getHeldItem().itemID == mod_BlocksGalore.DharokAxe.itemID) {
				if (boots != null && legs != null && chest != null
						&& helmet != null) {
					if (boots.getItem() == mod_phat.DharokBoots
							&& legs.getItem() == mod_phat.DharokLeggings
							&& chest.getItem() == mod_phat.DharokChestplate
							&& helmet.getItem() == mod_phat.DharokHelmet) {
						event.target.attackEntityFrom(
								DamageSource.causePlayerDamage(player), 60.0F);
						player.motionY = 0.35D;
					}

				}

			}
		}
	}

	// we need to add this new event - it is called for every living entity upon
	// death
	@ForgeSubscribe
	public void onLivingDeathEvent(LivingDeathEvent event) {

		if (!event.entity.worldObj.isRemote
				&& event.entity instanceof EntityPlayer) {

			NBTTagCompound playerData = new NBTTagCompound();
			NBTTagCompound playerData1 = new NBTTagCompound();
			
			((ExtendedPlayer) (event.entity.getExtendedProperties(ExtendedPlayer.EXT_PROP_NAME))).saveNBTData(playerData);
			
	
			mod_phat.proxy.storeEntityData(((EntityPlayer) event.entity).username + ExtendedPlayer.EXT_PROP_NAME, playerData);

			
			ExtendedPlayer.saveProxyData((EntityPlayer) event.entity);

		}

	}


	@ForgeSubscribe
	public void onEntityJoinWorld(EntityJoinWorldEvent event) {
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer) {

			NBTTagCompound playerData = mod_phat.proxy.getEntityData(((EntityPlayer) event.entity).username + ExtendedPlayer.EXT_PROP_NAME);
	
			
			if (playerData != null) {
				((ExtendedPlayer) (event.entity.getExtendedProperties(ExtendedPlayer.EXT_PROP_NAME))).loadNBTData(playerData);
			}
		
		}
		
		
		if (!event.entity.worldObj.isRemote && event.entity instanceof EntityPlayer){
			((ExtendedPlayer)(event.entity.getExtendedProperties(ExtendedPlayer.EXT_PROP_NAME))).sync();
		
	}}
}
