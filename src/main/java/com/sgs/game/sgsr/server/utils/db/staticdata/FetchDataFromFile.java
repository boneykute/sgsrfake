/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.db.staticdata;

import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.csv.CSVRecord;
import org.apache.commons.lang.time.DateUtils;

import com.sgs.game.sgsr.server.dto.IBaseDTO;
import com.sgs.game.sgsr.server.dto.enumitem.ElementType;
import com.sgs.game.sgsr.server.dto.enumitem.RarityType;
import com.sgs.game.sgsr.server.dto.enumitem.RequirementType;
import com.sgs.game.sgsr.server.dto.enumitem.ResourceType;
import com.sgs.game.sgsr.server.dto.enumitem.TargetType;
import com.sgs.game.sgsr.server.dto.staticdata.Avatar;
import com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO;
import com.sgs.game.sgsr.server.dto.staticdata.Booster;
import com.sgs.game.sgsr.server.dto.staticdata.Building;
import com.sgs.game.sgsr.server.dto.staticdata.CharacterSkill;
import com.sgs.game.sgsr.server.dto.staticdata.CharacterStat;
import com.sgs.game.sgsr.server.dto.staticdata.Chest;
import com.sgs.game.sgsr.server.dto.staticdata.DailyLoginReward;
import com.sgs.game.sgsr.server.dto.staticdata.Decoration;
import com.sgs.game.sgsr.server.dto.staticdata.Dungeon;
import com.sgs.game.sgsr.server.dto.staticdata.GlobalConfig;
import com.sgs.game.sgsr.server.dto.staticdata.IBaseStaticDataDTO;
import com.sgs.game.sgsr.server.dto.staticdata.League;
import com.sgs.game.sgsr.server.dto.staticdata.NickName;
import com.sgs.game.sgsr.server.dto.staticdata.Pack;
import com.sgs.game.sgsr.server.dto.staticdata.PlayerLevel;
import com.sgs.game.sgsr.server.dto.staticdata.Scroll;
import com.sgs.game.sgsr.server.dto.staticdata.Season;
import com.sgs.game.sgsr.server.dto.staticdata.Shop;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.BoostStats;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.BuildingLevelData;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.CharacterSkillLevelData;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.CharacterStatLevelData;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.ChestItem;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.DungeonItem;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.DungeonLevelData;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.PackItem;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.Requirement;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.SkillEffect;
import com.sgs.game.sgsr.server.utils.FileUtil;
import com.sgs.game.sgsr.server.utils.TimeUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class FetchDataFromFile.
 */
public class FetchDataFromFile {

	/**
	 * Fetch secondary rune effect configuration.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchSecondaryRuneEffect(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
	}

	/**
	 * Fetch secondary rune.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchSecondaryRune(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
	}

	/**
	 * Fetch primary rune configuration.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchPrimaryRuneConfiguration(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
	}

	/**
	 * Fetch primary rune.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchPrimaryRune(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
	}

	/**
	 * Fetch character skill.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchCharacterSkill(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> characterSkills = new HashMap<>();

		BaseStaticDataDTO dto = new BaseStaticDataDTO();
		String type = "";
		String skillType = "";
		int totalLevel = 0;
		List<CharacterSkillLevelData> levels = new ArrayList<>();

		for (CSVRecord record : records) {
			String idStr = record.get("Id");
			if (!idStr.isEmpty()) {
				dto = getBaseStaticDTOFromRecord(record);
				type = record.get("Type");
				skillType = record.get("SkillType");
				totalLevel = Integer.parseInt(record.get("TotalLevel"));
				levels = new ArrayList<>();
			}
			if (levels.size() < totalLevel - 1) {
				// Level data stuff
				String levelIdStr = record.get("Level");
				int levelId = 0;
				int levelUpCost = 0;
				float duration = 0;
				float castTime = 0;
				float cooldown = 0;
				TargetType targetType = TargetType.None;
				float targetRange = 0;
				float radius = 0;
				int angle = 0;
				float ATKMultiplier = 0;
				int projectileCount = 0;
				float projectileSpeed = 0;
				boolean isShotgun = false;
				float statusChance = 0;
				int totalEffect = 0;
				List<SkillEffect> effects = new ArrayList<>();

				if (!levelIdStr.isEmpty()) {
					levelId = Integer.parseInt(levelIdStr);
					levelUpCost = Integer.parseInt(record.get("LevelUpcost"));
					duration = Float.parseFloat(record.get("Duration"));
					castTime = Float.parseFloat(record.get("CastTime"));
					cooldown = Float.parseFloat(record.get("CoolDown"));
					targetType = TargetType.valueOf(record.get("Target"));
					targetRange = Float.parseFloat(record.get("TargetRamge"));
					radius = Float.parseFloat(record.get("Radius"));
					angle = Integer.parseInt(record.get("Angle"));
					ATKMultiplier = Float.parseFloat(record.get("ATKMultiplier"));
					projectileCount = Integer.parseInt(record.get("ProjectileCount"));
					projectileSpeed = Integer.parseInt(record.get("ProjectileSpeed"));
					isShotgun = record.get("IsShotGun").equals("1");
					statusChance = Float.parseFloat(record.get("StatusChange"));
					totalEffect = Integer.parseInt(record.get("TotalEffect"));
					effects = new ArrayList<>();
				}
				if (effects.size() < totalEffect - 1) {
					String effectStat = record.get("EffectedStat");
					TargetType effectTargetType = TargetType.valueOf(record.get("EffectTarget"));
					float effectAmount = Float.parseFloat(record.get("EffectAmount"));
					float effectDuration = Float.parseFloat(record.get("EffectDuration"));
					String effectOperator = record.get("EffectOperator");
					SkillEffect effect = new SkillEffect(effectStat, effectTargetType, effectAmount, effectDuration,
							effectOperator);
					effects.add(effect);
				} else {
					CharacterSkillLevelData levelData = new CharacterSkillLevelData(levelId, levelUpCost, duration,
							castTime, cooldown, targetType, targetRange, radius, angle, ATKMultiplier, projectileCount,
							projectileSpeed, isShotgun, statusChance, totalEffect, effects);
					levels.add(levelData);
				}
			} else {
				CharacterSkill characterSkill = new CharacterSkill(dto.getId(), dto.getName(), dto.getDescription(),
						type, skillType, totalLevel, levels);
				characterSkills.put(characterSkill.getId(), characterSkill);
			}
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.CharacterSkill.toString(), characterSkills);
	}

	/**
	 * Fetch character stat.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchCharacterStat(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> characterStats = new HashMap<>();
		BaseStaticDataDTO dto = new BaseStaticDataDTO();
		String role = "";
		RarityType rarityType = RarityType.None;
		ElementType elementType = ElementType.None;
		int baseLevel = 0;
		int baseStar = 0;
		int totalLevel = 0;
		List<CharacterStatLevelData> levels = new ArrayList<>();

		for (CSVRecord record : records) {
			String idStr = record.get("Id");
			if (!idStr.isEmpty()) {
				dto = getBaseStaticDTOFromRecord(record);
				role = record.get("Role");
				rarityType = RarityType.valueOf(record.get("Rarity"));
				elementType = ElementType.valueOf(record.get("Element"));
				baseLevel = Integer.parseInt(record.get("BaseLevel"));
				baseStar = Integer.parseInt(record.get("BaseStar"));
				totalLevel = Integer.parseInt(record.get("TotalLevel"));
				levels = new ArrayList<>();
			}
			if (levels.size() < totalLevel - 1) {
				int levelId = Integer.parseInt(record.get("Level"));
				int star = Integer.parseInt(record.get("Star"));
				int requiredSkillPoint = Integer.parseInt(record.get("RequiredSkillPoint"));
				float aggroRange = Float.parseFloat(record.get("AggroRange"));
				float attackRange = Float.parseFloat(record.get("AttackRange"));
				float moveSpeed = Float.parseFloat(record.get("MoveSpeed"));
				float attackSpeed = Float.parseFloat(record.get("AttackSpeed"));
				float criticalRate = Float.parseFloat(record.get("CriticalRate"));
				float criticalDamage = Float.parseFloat(record.get("CriticalDamage"));
				float resistance = Float.parseFloat(record.get("Resistance"));
				float regen = Float.parseFloat(record.get("Regen"));
				float dodge = Float.parseFloat(record.get("Dodge"));
				float blockDamageFlat = Float.parseFloat(record.get("BlockDamageFlat"));
				float blockDamagePercent = Float.parseFloat(record.get("BlockDamagePercent"));
				float lifePerHitFlat = Float.parseFloat(record.get("LifePerHitFlat"));
				float lifePerHitPercent = Float.parseFloat(record.get("LifePerHitPercent"));

				CharacterStatLevelData levelData = new CharacterStatLevelData(levelId, star, requiredSkillPoint,
						aggroRange, attackRange, moveSpeed, attackSpeed, criticalRate, criticalDamage, resistance,
						regen, dodge, blockDamageFlat, blockDamagePercent, lifePerHitFlat, lifePerHitPercent);
				levels.add(levelData);
			} else {
				CharacterStat characterStat = new CharacterStat(dto.getId(), dto.getName(), dto.getDescription(), role,
						rarityType, elementType, baseLevel, baseStar, totalLevel, levels);
			}
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.CharacterStat.toString(), characterStats);
	}

	/**
	 * Fetch player level.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchPlayerLevel(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> playerLevels = new HashMap<>();

		for (CSVRecord record : records) {
			BaseStaticDataDTO dto = getBaseStaticDTOFromRecord(record);
			int requiredEXP = Integer.parseInt(record.get("RequiredEXP"));
			PlayerLevel playerLevel = new PlayerLevel(dto.getId(), dto.getName(), dto.getDescription(), requiredEXP);
			playerLevels.put(playerLevel.getId(), playerLevel);
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.PlayerLevel.toString(), playerLevels);
	}

	/**
	 * Fetch season.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchSeason(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> seasons = new HashMap<>();

		for (CSVRecord record : records) {
			BaseStaticDataDTO dto = getBaseStaticDTOFromRecord(record);
			String startDateStr = record.get("StartDate");
			int duration = Integer.parseInt(record.get("Duration"));
			boolean isRepeat = record.get("IsRepeat").equals("1");
			Date startDate = TimeUtil.convertStringToDate(startDateStr);
			if (startDate == null) {
				try {
					throw new ParseException("FETCH SEASON STATIC DATA => Can't convert " + startDateStr + " to date",
							0);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return;
			} else {
				Season season = new Season(dto.getId(), dto.getName(), dto.getDescription(), startDate, duration,
						isRepeat);
				seasons.put(season.getId(), season);
			}
		}
		StaticDBUtil.getStaticData().get(version).put(DataFileType.Season.toString(), seasons);
	}

	/**
	 * Fetch league.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchLeague(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> leagues = new HashMap<>();

		for (CSVRecord record : records) {
			BaseStaticDataDTO dto = getBaseStaticDTOFromRecord(record);
			int requiredTrophies = Integer.parseInt(record.get("RequiredTrophies"));
			int demotionAt = Integer.parseInt(record.get("DemotionAt"));
			String[] characterUnlockArr = record.get("CharacterUnlock").split(",");
			List<String> characterUnlockList = new ArrayList<>();
			for (String characterUnlock : characterUnlockArr) {
				characterUnlockList.add(characterUnlock.trim());
			}
			League league = new League(dto.getId(), dto.getName(), dto.getDescription(), requiredTrophies, demotionAt,
					characterUnlockList);
			leagues.put(league.getId(), league);
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.League.toString(), leagues);
	}

	/**
	 * Fetch dungeon.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchDungeon(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> dungeons = new HashMap<>();

		BaseStaticDataDTO dto = new BaseStaticDataDTO();
		int totalLevel = 0;
		List<DungeonLevelData> levels = new ArrayList<>();

		for (CSVRecord record : records) {
			String idStr = record.get("Id");
			if (!idStr.isEmpty()) {
				dto = getBaseStaticDTOFromRecord(record);
				totalLevel = Integer.parseInt(record.get("TotalLevel"));
				levels = new ArrayList<>();
			}
			if (levels.size() < totalLevel - 1) {
				// Dungeon level data stuff
				String levelIdStr = record.get("Level");
				int levelId = 0;
				int requiredLevel = 0;
				int foodConsume = 0;
				int itemCount = 0;
				List<DungeonItem> items = new ArrayList<>();

				if (!levelIdStr.isEmpty()) {
					levelId = Integer.parseInt(levelIdStr);
					requiredLevel = Integer.parseInt(record.get("RequiredLevel"));
					foodConsume = Integer.parseInt(record.get("FoodConsume"));
					itemCount = Integer.parseInt(record.get("ItemCount"));
					items = new ArrayList<>();
				}
				if (items.size() < itemCount - 1) {
					int min = Integer.parseInt(record.get("Min"));
					int max = Integer.parseInt(record.get("Max"));
					String type = record.get("Type");
					DungeonItem item = new DungeonItem(type, min, max);
					items.add(item);
				} else {
					DungeonLevelData levelData = new DungeonLevelData(levelId, requiredLevel, foodConsume, itemCount,
							items);
					levels.add(levelData);
				}
			} else {
				Dungeon dungeon = new Dungeon(dto.getId(), dto.getName(), dto.getDescription(), totalLevel, levels);
				dungeons.put(dungeon.getId(), dungeon);
			}
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.Dungeon.toString(), dungeons);
	}

	/**
	 * Fetch building.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchBuilding(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> buildings = new HashMap<>();

		BaseStaticDataDTO dto = new BaseStaticDataDTO();
		boolean isResourceGenerator = false;
		ResourceType resourceType = ResourceType.None;
		float generateSpeed = 0;
		int maximumResource = 0;
		boolean isAttackable = false;
		boolean isOnPath = false;
		int totalLevel = 0;
		List<BuildingLevelData> levels = new ArrayList<>();

		for (CSVRecord record : records) {
			String idStr = record.get("Id");
			if (!idStr.isEmpty()) {
				dto = getBaseStaticDTOFromRecord(record);
				isResourceGenerator = record.get("IsResourceGenerator").equals("1");
				if (isResourceGenerator) {
					resourceType = ResourceType.valueOf(record.get("ResourceType"));
					generateSpeed = Float.parseFloat(record.get("GenerateSpeed"));
					maximumResource = Integer.parseInt(record.get("MaximumResource"));
				}
				isAttackable = record.get("IsAttackable").equals("1");
				isOnPath = record.get("IsOnPath").equals("1");
				totalLevel = Integer.parseInt(record.get("TotalLevel"));
				levels = new ArrayList<>();
			}

			if (levels.size() < totalLevel - 1) {
				int hp = Integer.parseInt(record.get("HP"));
				int cost = Integer.parseInt(record.get("Cost"));
				int size = Integer.parseInt(record.get("Size"));
				int damage = 0;
				int attackSpeed = 0;
				int range = 0;
				if (isAttackable) {
					damage = Integer.parseInt(record.get("Damage"));
					attackSpeed = Integer.parseInt(record.get("AttackSpeed"));
					range = Integer.parseInt(record.get("Range"));
				}
				BuildingLevelData levelData = new BuildingLevelData(levels.size(), hp, cost, damage, attackSpeed, range,
						size);
				levels.add(levelData);
			} else {
				Building building = new Building(dto.getId(), dto.getName(), dto.getDescription(), totalLevel,
						isResourceGenerator, resourceType, generateSpeed, maximumResource, isAttackable, isOnPath,
						levels);
				buildings.put(building.getId(), building);
			}
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.Building.toString(), buildings);
	}

	/**
	 * Fetch scroll.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchScroll(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> scrolls = new HashMap<>();

		for (CSVRecord record : records) {
			BaseStaticDataDTO dto = new BaseStaticDataDTO();
			RarityType rarityType = RarityType.valueOf(record.get("Rariry"));
			int commonPercent = Integer.parseInt(record.get("CommonPercent"));
			int rarePercent = Integer.parseInt(record.get("RarePercent"));
			int epicPercent = Integer.parseInt(record.get("EpicPercent"));
			int legendaryPercent = Integer.parseInt(record.get("LegendaryPercent"));

			// Fetch element type
			List<ElementType> elements = new ArrayList<>();
			String[] elementsStr = record.get("Elements").split(",");
			for (String elementStr : elementsStr) {
				ElementType elementType = ElementType.valueOf(elementStr.trim());
				elements.add(elementType);
			}

			Scroll scroll = new Scroll(dto.getId(), dto.getName(), dto.getDescription(), rarityType, elements,
					commonPercent, rarePercent, epicPercent, legendaryPercent);
			scrolls.put(scroll.getId(), scroll);
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.Scroll.toString(), scrolls);
	}

	/**
	 * Fetch chest.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchChest(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> chests = new HashMap<>();

		BaseStaticDataDTO dto = new BaseStaticDataDTO();
		RarityType rarityType = RarityType.None;
		int unlockTime = 0;
		int leagueId = 0;
		int itemCount = 0;
		List<ChestItem> items = new ArrayList<>();

		for (CSVRecord record : records) {
			String idStr = record.get("Id");
			if (!idStr.isEmpty()) {
				dto = getBaseStaticDTOFromRecord(record);
				rarityType = RarityType.valueOf(record.get("Rarity"));
				unlockTime = Integer.parseInt("Unlocktime");
				leagueId = Integer.parseInt(record.get("LeagueId"));
				itemCount = Integer.parseInt(record.get("ItemCount"));
				items = new ArrayList<>();
			}

			if (items.size() < itemCount - 1) {
				int min = Integer.parseInt(record.get("Min"));
				int max = Integer.parseInt(record.get("Max"));
				String type = record.get("Type");
				int guaranteedRare = 0;
				int guaranteedEpic = 0;
				int guaranteedLegendary = 0;
				float percentBonusRare = 0;
				float percentBonusEpic = 0;
				float percentBonusLegendary = 0;

				if (type.equals("Scroll")) {
					guaranteedRare = Integer.parseInt(record.get("GuaranreedRare"));
					guaranteedEpic = Integer.parseInt(record.get("GuaranreedEpic"));
					guaranteedLegendary = Integer.parseInt(record.get("GuaranreedLegendary"));
					percentBonusRare = Float.parseFloat(record.get("PercentBonusRare"));
					percentBonusEpic = Float.parseFloat(record.get("PercentBonusEpic"));
					percentBonusLegendary = Float.parseFloat(record.get("PercentBonusLegendary"));
				}
				ChestItem chestItem = new ChestItem(type, min, max, guaranteedRare, guaranteedEpic, guaranteedLegendary,
						percentBonusRare, percentBonusEpic, percentBonusLegendary);
				items.add(chestItem);
			} else {
				Chest chest = new Chest(dto.getId(), dto.getName(), dto.getDescription(), rarityType, leagueId,
						itemCount, unlockTime, items);
				chests.put(chest.getId(), chest);
			}
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.Chest.toString(), chests);
	}

	/**
	 * Fetch booster.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchBooster(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> boosters = new HashMap<>();

		BaseStaticDataDTO dto = new BaseStaticDataDTO();
		int statsCount = 0;
		List<BoostStats> boostStats = new ArrayList<>();

		for (CSVRecord record : records) {
			String idStr = record.get("Id");
			if (!idStr.isEmpty()) {
				dto = getBaseStaticDTOFromRecord(record);
				statsCount = Integer.parseInt(record.get("BoostStatsCount"));
				boostStats = new ArrayList<>();
			}

			if (boostStats.size() < statsCount - 1) {
				String statName = record.get("StatName");
				int amountPercent = Integer.parseInt(record.get("BoostAmountPercent"));
				int amountFlat = Integer.parseInt(record.get("BoostAmountFlat"));
				BoostStats stats = new BoostStats(statName, amountPercent, amountFlat);
				boostStats.add(stats);
			} else {
				Booster booster = new Booster(dto.getId(), dto.getName(), dto.getDescription(), statsCount, boostStats);
				boosters.put(booster.getId(), booster);
			}
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.Booster.toString(), boosters);
	}

	/**
	 * Fetch decoration.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchDecoration(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> decorations = new HashMap<>();
		for (CSVRecord record : records) {
			BaseStaticDataDTO dto = getBaseStaticDTOFromRecord(record);
			int price = Integer.parseInt(record.get("Price"));
			ResourceType resourceType = ResourceType.getEnumFromName(record.get("ResourceType"));
			int quantity = Integer.parseInt(record.get("Quantity"));
			int order = Integer.parseInt(record.get("Order"));

			Decoration decoration = new Decoration(dto.getId(), dto.getName(), dto.getDescription(), price,
					resourceType, quantity, order);
			decorations.put(decoration.getId(), decoration);
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.Decoration.toString(), decorations);
	}

	/**
	 * Fetch pack.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchPack(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> packs = new HashMap<>();
		BaseStaticDataDTO dto = new BaseStaticDataDTO();
		int itemCount = 0;
		List<PackItem> items = new ArrayList<>();
		for (CSVRecord record : records) {
			String idStr = record.get("Id");
			if (!idStr.isEmpty()) {
				dto = getBaseStaticDTOFromRecord(record);
				itemCount = Integer.parseInt(record.get("ItemCount"));
			}
			if (items.size() < itemCount - 1) {
				String itemName = record.get("ItemName");
				int amount = Integer.parseInt(record.get("Amount"));
				PackItem item = new PackItem(items.size(), itemName, amount);
				items.add(item);
			} else {
				Pack pack = new Pack(dto.getId(), dto.getName(), dto.getDescription(), itemCount, items);
				packs.put(pack.getId(), pack);
				// Reset variables
				dto = new BaseStaticDataDTO();
				itemCount = 0;
				items = new ArrayList<>();
			}
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.Pack.toString(), packs);
	}

	/**
	 * Fetch shop.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchShop(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> shopItems = new HashMap<>();

		for (CSVRecord record : records) {
			BaseStaticDataDTO dto = getBaseStaticDTOFromRecord(record);
			String type = record.get("Type");
			int itemId = Integer.parseInt(record.get("ItemId"));
			int price = Integer.parseInt(record.get("Price"));
			int order = Integer.parseInt(record.get("Order"));
			String category = record.get("Category");
			String tab = record.get("Tab");
			int cooldownTime = Integer.parseInt(record.get("CooldownTime"));

			Shop shopItem = new Shop(dto.getId(), dto.getName(), dto.getDescription(), type, itemId, price, order,
					category, tab, cooldownTime);
			shopItems.put(shopItem.getId(), shopItem);
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.Shop.toString(), shopItems);
	}

	/**
	 * Fetch nick name.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchNickName(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> nickNames = new HashMap<>();
		BaseStaticDataDTO dto = new BaseStaticDataDTO();
		int requirementCount = 0;
		List<Requirement> requirements = new ArrayList<>();
		for (CSVRecord record : records) {
			String idStr = record.get("Id");
			if (!idStr.isEmpty()) {
				dto = getBaseStaticDTOFromRecord(record);
				requirementCount = Integer.parseInt(record.get("RequirementCount"));
				requirements = new ArrayList<>();
			}
			if (requirements.size() < requirementCount - 1) {
				RequirementType requirementType = RequirementType.getEnumFromName(record.get("RequirementType"));
				int amount = Integer.parseInt(record.get("Amount"));
				Requirement requirement = new Requirement(amount, requirementType);
				requirements.add(requirement);
			} else {
				NickName nickName = new NickName(dto.getId(), dto.getName(), dto.getDescription(), requirementCount,
						requirements);
				nickNames.put(nickName.getId(), nickName);
			}
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.NickName.toString(), nickNames);
	}

	/**
	 * Fetch avatar.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchAvatar(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> avatars = new HashMap<>();
		BaseStaticDataDTO dto = new BaseStaticDataDTO();
		int requirementCount = 0;
		List<Requirement> requirements = new ArrayList<>();
		for (CSVRecord record : records) {
			String idStr = record.get("Id");
			if (!idStr.isEmpty()) {
				dto = getBaseStaticDTOFromRecord(record);
				requirementCount = Integer.parseInt(record.get("RequirementCount"));
				requirements = new ArrayList<>();
			}
			if (requirements.size() < requirementCount - 1) {
				RequirementType requirementType = RequirementType.getEnumFromName(record.get("RequirementType"));
				int amount = Integer.parseInt(record.get("Amount"));
				Requirement requirement = new Requirement(amount, requirementType);
				requirements.add(requirement);
			} else {
				Avatar avatar = new Avatar(dto.getId(), dto.getName(), dto.getDescription(), requirementCount,
						requirements);
				avatars.put(dto.getId(), avatar);
			}
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.Avatar.toString(), avatars);
	}

	/**
	 * Fetch daily login reward.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchDailyLoginReward(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> dailyLoginRewards = new HashMap<>();

		for (CSVRecord record : records) {
			BaseStaticDataDTO dto = getBaseStaticDTOFromRecord(record);
			int day = Integer.parseInt(record.get("Day"));
			int month = Integer.parseInt(record.get("Month"));
			int packId = Integer.parseInt(record.get("PackId"));

			DailyLoginReward dailyLoginReward = new DailyLoginReward(dto.getId(), dto.getName(), dto.getDescription(),
					day, month, packId);
			dailyLoginRewards.put(dailyLoginReward.getId(), dailyLoginReward);
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.DailyLoginReward.toString(), dailyLoginRewards);
	}

	/**
	 * Fetch global config.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	@SuppressWarnings("rawtypes")
	private static void fetchGlobalConfig(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
		HashMap<Integer, BaseStaticDataDTO> globalConfigs = new HashMap<>();
		for (CSVRecord record : records) {
			BaseStaticDataDTO dto = getBaseStaticDTOFromRecord(record);
			float value = Float.parseFloat(record.get("Value"));
			GlobalConfig globalConfig = new GlobalConfig(dto.getId(), dto.getName(), dto.getDescription(), value);
			globalConfigs.put(globalConfig.getId(), globalConfig);
		}

		StaticDBUtil.getStaticData().get(version).put(DataFileType.GlobalConfig.toString(), globalConfigs);
	}

	/**
	 * Gets the base static DTO from record.
	 *
	 * @param record
	 *            the record
	 * @return the base static DTO from record
	 */
	private static BaseStaticDataDTO<IBaseDTO> getBaseStaticDTOFromRecord(CSVRecord record) {
		int id = Integer.parseInt(record.get("Id"));
		String name = "";
		String description = "";
		try {
			name = record.get("Name");
		} catch (Exception e) {
		}
		try {
			description = record.get("Description");
		} catch (Exception e) {
		}

		BaseStaticDataDTO<IBaseDTO> dto = new BaseStaticDataDTO<>(id, name, description);
		return dto;
	}

	/**
	 * Fetch data from file.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	static void fetch(String version, File file) {
		// Get filename without extension to check
		String fileNameWithoutExtension = FileUtil.getFileNameWithoutExtension(file.getName());
		// Find data file type
		DataFileType dataFileType = getDataFileType(fileNameWithoutExtension);
		// Update static data
		switch (dataFileType) {
		case GlobalConfig:
			fetchGlobalConfig(version, file);
			break;
		case DailyLoginReward:
			fetchDailyLoginReward(version, file);
			break;
		case Avatar:
			fetchAvatar(version, file);
			break;
		case NickName:
			fetchNickName(version, file);
			break;
		case Shop:
			fetchShop(version, file);
			break;
		case Pack:
			fetchPack(version, file);
			break;
		case Decoration:
			fetchDecoration(version, file);
			break;
		case Booster:
			fetchBooster(version, file);
			break;
		case Chest:
			fetchChest(version, file);
			break;
		case Scroll:
			fetchScroll(version, file);
			break;
		case Building:
			fetchBuilding(version, file);
			break;
		case Dungeon:
			fetchDungeon(version, file);
			break;
		case League:
			fetchLeague(version, file);
			break;
		case Season:
			fetchSeason(version, file);
			break;
		case PlayerLevel:
			fetchPlayerLevel(version, file);
			break;
		case CharacterStat:
			fetchCharacterStat(version, file);
			break;
		case CharacterSkill:
			fetchCharacterSkill(version, file);
			break;
		case PrimaryRune:
			fetchPrimaryRune(version, file);
		case PrimaryRuneConfiguration:
			fetchPrimaryRuneConfiguration(version, file);
			break;
		case SecondaryRune:
			fetchSecondaryRune(version, file);
			break;
		case SecondaryRuneEffect:
			fetchSecondaryRuneEffect(version, file);
			break;
		default:
			break;
		}
	}

	/**
	 * Gets the data file type.
	 *
	 * @param fileName
	 *            the file name
	 * @return the data file type
	 */
	private static DataFileType getDataFileType(final String fileName) {
		return DataFileType.getEnumFromName(fileName);
	}
}
