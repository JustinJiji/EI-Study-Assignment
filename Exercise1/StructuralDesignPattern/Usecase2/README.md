# Use Case: Legacy System Interacting with a Modern API
## Description
This project implements an adapter to bridge the gap between a legacy system and a modern API, allowing them to communicate.

## Structure
- `LegacySystem`: The legacy system expecting a specific interface.
- `ModernAPI`: The new API with a different interface.
- `ModernAPIAdapter`: An adapter that adapts the interface of `ModernAPI` to meet the expectations of the `LegacySystem`.
