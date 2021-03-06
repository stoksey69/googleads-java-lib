// Copyright 2013 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package adwords.axis.utility.extension.basicoperations;

import com.google.api.ads.adwords.axis.utility.extension.ExtendedManagedCustomer;
import com.google.api.ads.adwords.axis.v201506.cm.Campaign;

import java.util.List;

/**
 * This example gets all campaigns. To add a campaign, run AddCampaign.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 *
 * Tags: CampaignService.get
 *
 * @author Julian Toledo
 */
public class GetCampaigns {

  public static void main(String[] args) throws Exception {
    // Creating ExtendedManagedCustomer using OAuth2 credentials form file
    ExtendedManagedCustomer extendedManagedCustomer = ExtendedManagedCustomer.withOAuth2FromFile();

    runExample(extendedManagedCustomer);
  }

  public static void runExample(ExtendedManagedCustomer extendedManagedCustomer) throws Exception {

    List<Campaign> campaigns = extendedManagedCustomer.getCampaigns();

    for (Campaign campaign : campaigns) {
      System.out.printf("Campaign with name '%s' and ID '%d' was found.\n",
          campaign.getName(), campaign.getId());
    }
  }
}
