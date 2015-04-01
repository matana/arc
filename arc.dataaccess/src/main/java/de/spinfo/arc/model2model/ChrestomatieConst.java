package de.spinfo.arc.model2model;

public interface ChrestomatieConst {
	public static String[] wuTitles = {
		"oct_001",// 0 - 375211
		"oct_002", // 375212 - 613382
		"oct_003", // 613383 - 620614
		"oct_004", // 620615 - 1074776
		"oct_005", // 1074777 - 1233318
		"oct_006", // 1233319 - 1447888
		"oct_007", // 1447889 - 1658508
		"oct_008", // 1658509 - 1847733
		"oct_009", // 1847734 - 1912089
		"oct_010", // 1912090 - 2395127
		"oct_011", // 2395128 - 2524928
		"oct_012", // 2524929 - 2630882
		"oct_013", // 2630883 - 2722116
		"oct_014", // 2722117 - 2775612
	};
	public static String[] wuTitles2 = {
		"Band I",// 0 - 375211
		"Band II", // 375212 - 613382
		"Band III", // 613383 - 620614
		"Band VI", // 620615 - 1074776
		"Band V", // 1074777 - 1233318
		"Band VI", // 1233319 - 1447888
		"Band VII", // 1447889 - 1658508
		"Band VIII", // 1658509 - 1847733
		"Band IX", // 1847734 - 1912089
		"Band X", // 1912090 - 2395127
		"Band XI", // 2395128 - 2524928
		"Band XII", // 2524929 - 2630882
		"Band XIII", // 2630883 - 2722116
		"Band XVI", // 2722117 - 2775612
	};
	
	
	public static int[] wuSizes = {
		375211 - 0,
		613382 - 375212,  
		620614 - 613383, 
		1074776 - 620615, 
		1233318 - 1074777, 
		1447888 - 1233319, 
		1658508 - 1447889,
		1847733 - 1658509, 
		1912089 - 1847734, 
		2395127 - 1912090, 
		2524928 - 2395128, 
		2630882 - 2524929, 
		2722116 - 2630883, 
		2775612 - 2722117  
	};
	public static int[] wuNumPages = {
		875,
		724,  
		40, 
		1032, 
		503, 
		667, 
		501,
		622, 
		309, 
		1198, 
		360, 
		358, 
		250, 
		161  
	};
	public static int[] wuNumChapters = {
		153,
		18,  
		6, 
		54, 
		25, 
		41, 
		35,
		24, 
		6, 
		118, 
		22, 
		22, 
		8, 
		1
	};
	
}
