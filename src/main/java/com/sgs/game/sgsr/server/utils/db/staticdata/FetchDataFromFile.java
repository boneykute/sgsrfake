/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.utils.db.staticdata;

import java.io.File;

import com.sgs.game.sgsr.server.utils.FileUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class FetchDataFromFile.
 */
public class FetchDataFromFile {

	/**
	 * Fetch secondary rune effect configuration.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchSecondaryRuneEffectConfiguration(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch secondary rune configuration.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchSecondaryRuneConfiguration(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch secondary rune.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchSecondaryRune(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch primary rune configuration.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchPrimaryRuneConfiguration(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch primary rune.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchPrimaryRune(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch character skill.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchCharacterSkill(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch character stat.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchCharacterStat(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch player level.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchPlayerLevel(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch season.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchSeason(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch league.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchLeague(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch dungeon.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchDungeon(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch building.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchBuilding(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch scroll.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchScroll(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch chest.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchChest(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch booster.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchBooster(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch decoration.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchDecoration(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch pack.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchPack(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch shop.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchShop(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch resource type.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchResourceType(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch nick name.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchNickName(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch avatar.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchAvatar(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch daily login reward.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchDailyLoginReward(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch faction.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchFaction(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch element.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchElement(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch global config.
	 *
	 * @param file
	 *            the file
	 */
	private static void fetchGlobalConfig(File file) {
		// TODO Auto-generated method stub

	}

	/**
	 * Fetch data from file.
	 *
	 * @param file
	 *            the file
	 */
	static void fetch(File file) {
		// Get filename without extension to check
		String fileNameWithoutExtension = FileUtil.getFileNameWithoutExtension(file.getName());
		// Find data file type
		DataFileType dataFileType = getDataFileType(fileNameWithoutExtension);
		// Update static data
		switch (dataFileType) {
		case GlobalConfig:
			fetchGlobalConfig(file);
			break;
		case Element:
			fetchElement(file);
			break;
		case Faction:
			fetchFaction(file);
			break;
		case DailyLoginReward:
			fetchDailyLoginReward(file);
			break;
		case Avatar:
			fetchAvatar(file);
			break;
		case NickName:
			fetchNickName(file);
			break;
		case ResourceType:
			fetchResourceType(file);
			break;
		case Shop:
			fetchShop(file);
			break;
		case Pack:
			fetchPack(file);
			break;
		case Decoration:
			fetchDecoration(file);
			break;
		case Booster:
			fetchBooster(file);
			break;
		case Chest:
			fetchChest(file);
			break;
		case Scroll:
			fetchScroll(file);
			break;
		case Building:
			fetchBuilding(file);
			break;
		case Dungeon:
			fetchDungeon(file);
			break;
		case League:
			fetchLeague(file);
			break;
		case Season:
			fetchSeason(file);
			break;
		case PlayerLevel:
			fetchPlayerLevel(file);
			break;
		case CharacterStat:
			fetchCharacterStat(file);
			break;
		case CharacterSkill:
			fetchCharacterSkill(file);
			break;
		case PrimaryRune:
			fetchPrimaryRune(file);
		case PrimaryRuneConfiguration:
			fetchPrimaryRuneConfiguration(file);
			break;
		case SecondaryRune:
			fetchSecondaryRune(file);
			break;
		case SecondaryRuneConfiguration:
			fetchSecondaryRuneConfiguration(file);
			break;
		case SecondaryRuneEffectConfiguration:
			fetchSecondaryRuneEffectConfiguration(file);
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
		if (fileName.startsWith("CharacterStat")) {
			return DataFileType.CharacterStat;
		} else if (fileName.startsWith("CharacterSkill")) {
			return DataFileType.CharacterSkill;
		} else {
			for (DataFileType fileType : DataFileType.values()) {
				if (fileName.equals(fileType.toString())) {
					return fileType;
				}
			}
		}
		return DataFileType.None;
	}
}
