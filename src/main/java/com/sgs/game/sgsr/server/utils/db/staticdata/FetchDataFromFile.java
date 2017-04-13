/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.db.staticdata;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.csv.CSVRecord;

import com.sgs.game.sgsr.server.dto.IBaseDTO;
import com.sgs.game.sgsr.server.dto.enumitem.RequirementType;
import com.sgs.game.sgsr.server.dto.staticdata.Avatar;
import com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO;
import com.sgs.game.sgsr.server.dto.staticdata.DailyLoginReward;
import com.sgs.game.sgsr.server.dto.staticdata.GlobalConfig;
import com.sgs.game.sgsr.server.dto.staticdata.IBaseStaticDataDTO;
import com.sgs.game.sgsr.server.dto.staticdata.NickName;
import com.sgs.game.sgsr.server.dto.staticdata.Pack;
import com.sgs.game.sgsr.server.dto.staticdata.Shop;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.PackItem;
import com.sgs.game.sgsr.server.dto.staticdata.subitem.Requirement;
import com.sgs.game.sgsr.server.utils.FileUtil;

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
	private static void fetchCharacterSkill(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
	}

	/**
	 * Fetch character stat.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchCharacterStat(String version, File file) {
		Iterable<CSVRecord> records = FileUtil.readCSVFile(file);
	}

	/**
	 * Fetch player level.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchPlayerLevel(String version, File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch season.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchSeason(String version, File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch league.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchLeague(String version, File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch dungeon.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchDungeon(String version, File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch building.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchBuilding(String version, File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch scroll.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchScroll(String version, File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch chest.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchChest(String version, File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch booster.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchBooster(String version, File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch decoration.
	 *
	 * @param version
	 *            the version
	 * @param file
	 *            the file
	 */
	private static void fetchDecoration(String version, File file) {
		// TODO Auto-generated method stub

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
				// Reset variable to prepare for a new item
				dto = new BaseStaticDataDTO();
				requirementCount = 0;
				requirements = new ArrayList<>();
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
				// Reset variable to prepare for a new item
				dto = new BaseStaticDataDTO();
				requirementCount = 0;
				requirements = new ArrayList<>();
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
