/**
 * Copyright 2020 - 2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.walnutit.factorymethod.domain.features.id4;

import com.walnutit.factorymethod.domain.features.ElectroCarFeatures;
import com.walnutit.factorymethod.domain.features.general.BatteryCapacity;
import com.walnutit.factorymethod.domain.features.general.Color;
import com.walnutit.factorymethod.domain.features.general.Engine;
import com.walnutit.factorymethod.domain.features.general.ExtraEquipment;
import com.walnutit.factorymethod.domain.features.general.Rim;

/**
 * @author Daniel Krentzlin
 *
 */
public class ElectroCarFeaturesID4Version1 extends ElectroCarFeatures{
	
	public static ElectroCarFeaturesID4Version1 getElectroCarFEaturesID4Version1(
			Engine engine, Color color,
			BatteryCapacity batteryCapacity, Rim rim,
			ExtraEquipment extraEquipment) {
		return new ElectroCarFeaturesID4Version1(engine, color,
				batteryCapacity, rim, extraEquipment);
	}

	/**
	 * @param engine
	 * @param color
	 * @param batteryCapacity
	 * @param rim
	 * @param extraEquipment
	 */
	private ElectroCarFeaturesID4Version1(Engine engine, Color color,
			BatteryCapacity batteryCapacity, Rim rim,
			ExtraEquipment extraEquipment) {
		super(engine, color, batteryCapacity, rim, extraEquipment);
		// TODO Auto-generated constructor stub
	}

}
