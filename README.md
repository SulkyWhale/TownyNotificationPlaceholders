# TownyNotificationPlaceholders

A Minecraft plugin for Paper that allows the usage of PlaceholderAPI placeholders to be used in Towny plot notifications.

## Dependencies

- [Towny](https://github.com/TownyAdvanced/Towny)
- [PlaceholderAPI](https://github.com/PlaceholderAPI/PlaceholderAPI)

## Installation

1. Download the latest JAR from [Releases](https://github.com/SulkyWhale/TownyNotificationPlaceholders/releases) and place it in your plugins folder.
2. Restart your server.
3. Add PlaceholderAPI placeholders to your Towny `config.yml` under the section `Town Notifications`.
   
   Example using the %townyadvanced_player_plot_owner% placeholder:
   ```yaml
   owner: '&a%s &2Yours: {townyadvanced_player_plot_owner}'
   ```

   *For the placeholders to work, you will need to replace all `%` symbols in the placeholders with `{` and `}`.*
4. Run `/ta reload config` to implement your changes.

## Building

If you wish to build the plugin yourself, follow the instructions below.

1. Clone the repository:
    ```shell
    git clone https://github.com/SulkyWhale/TownyNotificationPlaceholders.git
    ```
2. Change into the working directory:
    ```shell
    cd TownyNotificationPlaceholders
    ```
3. Build the JAR with Maven:
    ```shell
    mvn clean package
    ```

## Issues

If you encounter any bugs or would like a new feature added, please open an [issue](https://github.com/SulkyWhale/TownyNotificationPlaceholders/issues/new). Be sure to check existing issues first to avoid duplicates.

## Contributing

Contributions are welcome. If you have any bug fixes, improvements, or new features you would like to add to this project, feel free to open a [pull request](https://github.com/SulkyWhale/TownyNotificationPlaceholders/pulls).

## License

TownyNotificationPlaceholders is licensed under the GNU GPL v3. Please see the [license](/LICENSE.md) for more information.
