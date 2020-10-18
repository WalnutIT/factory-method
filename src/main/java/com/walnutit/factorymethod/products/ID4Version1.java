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
package com.walnutit.factorymethod.products;

import com.walnutit.factorymethod.ElectroCar;
import com.walnutit.factorymethod.domain.features.ElectroCarFeatures;
import com.walnutit.factorymethod.utils.Timer;

/**
 * @author Daniel Krentzlin
 *
 */
public class ID4Version1 extends ElectroCar {

	private ElectroCarFeatures carFeatures;

	public static ID4Version1 getID4Version1(
			ElectroCarFeatures carFeatures) {
		return new ID4Version1(carFeatures);
	}

	/**
	 * @param carFeatures
	 */
	private ID4Version1(ElectroCarFeatures carFeatures) {
		this.carFeatures = carFeatures;
	}

	@Override
	public void addToProduction() {
		System.out.println(
				"... adding order to production pipeline of VW ID 4 Version 1");

		Timer.sleep(1);
		System.out.println("... starting production");
		Timer.sleep(1);
		System.out.println("... adding " + carFeatures.getEngine());
		Timer.sleep(4);
		System.out.println(
				"... adding " + carFeatures.getBatteryCapacity());
		Timer.sleep(6);
		System.out.println(
				"... painting car in " + carFeatures.getColor());
		Timer.sleep(3);
		System.out.println("... adding rim: " + carFeatures.getRim());
		Timer.sleep(2);
		System.out.println("... adding extra equipement package: "
				+ carFeatures.getExtraEquipment());
		Timer.sleep(3);
		System.out.println(
				"... finished production of VW ID 3 Version 2 with configuration id: "
						+ carFeatures.getConfigurationId());
		Timer.sleep(2);
		System.out.println("... electro car with configuration id "
				+ carFeatures.getConfigurationId()
				+ " is ready for testing");
	}

}
